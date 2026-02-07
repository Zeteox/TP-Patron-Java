public class LivraisonExpress implements StrategieLivraison {

    @Override
    public boolean paiement(int somme) {
        System.out.println("Paiement de " + somme + "€ + 10€ pour une livraison express.");
        return true;
    }
}
