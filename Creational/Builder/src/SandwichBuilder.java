public class SandwichBuilder {
    private final Sandwich sandwich;

    public SandwichBuilder() {
        this.sandwich = new Sandwich();
    }

    public SandwichBuilder setBread(String bread) {
        this.sandwich.setBread(bread);
        return this;
    }

    public SandwichBuilder setMeat(String meat) {
        this.sandwich.setMeat(meat);
        return this;
    }

    public SandwichBuilder setCheese(String cheese) {
        this.sandwich.setCheese(cheese);
        return this;
    }

    public SandwichBuilder setVegetable(String vegetable) {
        this.sandwich.setVegetable(vegetable);
        return this;
    }

    public SandwichBuilder setSauce(String sauce) {
        this.sandwich.setSauce(sauce);
        return this;
    }

    public SandwichBuilder setGrilled(boolean grilled) {
        this.sandwich.setGrilled(grilled);
        return this;
    }

    public Sandwich build() {
        if (this.sandwich.getBread() == null) {throw new IllegalStateException("Sandwich must have bread");}
        return sandwich;
    }
}
