public class BurgerFactory {
    public static Burger createBurger(BurgerType type) {
        Burger burger = null;
        switch (type) {
            case BurgerType.CHEESE_BURGER:
                burger = new CheeseBurger();
                break;
            case BurgerType.BURGER_VEGGIE:
                burger = new BurgerVeggie();
                break;
            case BurgerType.CHICKEN_BURGER:
                burger = new ChickenBurger();
                break;
            default:
                throw new IllegalArgumentException("Invalid burger type");
        }
        return burger;
    }
}
