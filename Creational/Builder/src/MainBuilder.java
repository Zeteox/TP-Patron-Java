void main() {
    Sandwich sandwich1 = new SandwichBuilder()
            .setBread("complet")
            .setMeat("poulet")
            .setCheese("gruillere")
            .setGrilled(true)
            .build();

    Sandwich sandwich2 = new SandwichBuilder()
            .setBread("pita")
            .setVegetable("courgette")
            .setSauce("burger")
            .build();

    Sandwich sandwich3 = new SandwichBuilder()
            .setBread("baguette")
            .setMeat("jambon")
            .setCheese("emmental")
            .build();

    sandwich1.showIngredients();
    sandwich2.showIngredients();
    sandwich3.showIngredients();
}
