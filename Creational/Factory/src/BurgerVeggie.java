public class BurgerVeggie implements Burger{
    @Override
    public String getName() {
        return "Burger Veggie";
    }

    @Override
    public String getIngredients() {
        return "pain complet, salade, tomate, carotte";
    }

    @Override
    public String getPrice() {
        return "8€";
    }

    @Override
    public void showDescription() {
        System.out.println(this.getName());
        System.out.println(this.getIngredients());
        System.out.println(this.getPrice());
        System.out.println("---------------");
    }
}
