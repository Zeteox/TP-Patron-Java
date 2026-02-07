public class LivraisonStandard implements StrategieLivraison {
    @Override
    public boolean paiement(int somme) {
        System.out.println("Paiement de " + somme + "€ pour une livraison standard.");
        return true;
    }
}
