import java.util.List;
import java.util.Scanner;

public class Commande {
    private List<StrategieLivraison> strategieLivraisons = List.of(
        new LivraisonStandard(),
        new LivraisonExpress(),
        new ClickAndCollect()
    );

    public Commande() {}

    public static void Commander() {
        Commande commande = new Commande();
        System.out.println("Choisissez une stratégie de livraison pour votre commande :");
        for (int i=0; i < commande.strategieLivraisons.size(); i++) {
            System.out.println(i+1 + ". " + commande.strategieLivraisons.get(i).getClass().getSimpleName());
        }
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        if (choix < 1 || choix > commande.strategieLivraisons.size()) {
            System.out.println("Choix invalide.");
            return;
        }
        StrategieLivraison strategieChoisie = commande.strategieLivraisons.get(choix - 1);
        System.out.println("Entrez le montant à payer :");
        int montant = sc.nextInt();
        if (strategieChoisie.paiement(montant)) {
            return;
        } else {
            System.out.println("Paiement échoué avec " + strategieChoisie.toString());
        }
    }
}
