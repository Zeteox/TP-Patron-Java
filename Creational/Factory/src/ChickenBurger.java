public class ChickenBurger implements Burger{
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public String getIngredients() {
        return "pain burger, poulet pané croustillant, sauce BBQ";
    }

    @Override
    public String getPrice() {
        return "9€";
    }

    @Override
    public void showDescription() {
        System.out.println(this.getName());
        System.out.println(this.getIngredients());
        System.out.println(this.getPrice());
        System.out.println("---------------");
    }
}
