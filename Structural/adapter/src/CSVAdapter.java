import java.util.HashMap;
import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {
    private LecteurCSV lecteur;

    public CSVAdapter(String nomFichier) {
        lecteur = new LecteurCSV(nomFichier);
    }

    @Override
    public double getTotalVentes() {
        double total = 0.0;
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);
            String[] nombres = colonnes[2].split("x");
            total += Double.parseDouble(nombres[0]) * Double.parseDouble(nombres[1]);
        }
        return total;
    }

    @Override
    public int getNbCommandes() {
        return lecteur.getNbLignes() - 1;
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        Map<String, Double> resultat = new HashMap<String, Double>();
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);
            String[] nombres = colonnes[2].split("x");
            resultat.put(colonnes[1], Double.parseDouble(nombres[0]) * Double.parseDouble(nombres[1]));
        }
        return resultat;
    }
}