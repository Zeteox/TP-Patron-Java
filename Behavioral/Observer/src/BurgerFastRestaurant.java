import java.util.List;

public class BurgerFastRestaurant {
    private List<ClientVIP> clients;

    public  BurgerFastRestaurant(List<ClientVIP> clients) {
        this.clients = clients;
    }

    public void createPromotion(String title, String description) {
        Promotion promo = new Promotion(title, description);
        promo.showPromotion();
        this.notifyClientVIP();
    }

    private void notifyClientVIP() {
        for (ClientVIP clientVIP : clients) {
            clientVIP.notifyClient();
        }
    }
}
