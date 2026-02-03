void main() {
    List<Burger> burgers = List.of(
            BurgerFactory.createBurger(BurgerType.BURGER_VEGGIE),
            BurgerFactory.createBurger(BurgerType.CHEESE_BURGER),
            BurgerFactory.createBurger(BurgerType.CHICKEN_BURGER)
    );

    for (Burger burger : burgers) {
        burger.showDescription();
    }
}
