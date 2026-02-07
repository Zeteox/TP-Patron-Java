public class ClickAndCollect implements StrategieLivraison {

    @Override
    public boolean paiement(int somme) {
        System.out.println("Vous avez payé en ligne, votre commande est prête à être récupérée en magasin.");
        return true;
    }
}
