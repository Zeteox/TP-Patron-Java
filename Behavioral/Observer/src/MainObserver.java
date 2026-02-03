void main() {
    List<ClientVIP> clients = List.of(
            new ClientVIP("Lundi"),
            new ClientVIP("Mardi"),
            new ClientVIP("Mercredi"),
            new ClientVIP("Jeudi"),
            new ClientVIP("Vendredi")
    );

    BurgerFastRestaurant restaurant = new BurgerFastRestaurant(clients);

    restaurant.createPromotion("Reduction de 1€!!!!!", "Burger a seulement 99999 au lieu de 100000 !!!!!!");
}