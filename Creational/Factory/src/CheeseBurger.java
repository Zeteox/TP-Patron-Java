public class CheeseBurger implements Burger{
    @Override
    public String getName() {
        return "Cheese Burger";
    }

    @Override
    public String getIngredients() {
        return "pain sesame, steak haché, cheddar fondu";
    }

    @Override
    public String getPrice() {
        return "10€";
    }

    @Override
    public void showDescription() {
        System.out.println(this.getName());
        System.out.println(this.getIngredients());
        System.out.println(this.getPrice());
        System.out.println("---------------");
    }
}
