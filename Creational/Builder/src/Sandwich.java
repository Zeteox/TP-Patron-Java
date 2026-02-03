public class Sandwich {
    private String bread;
    private String meat;
    private String cheese;
    private String vegetable;
    private String sauce;
    private boolean grilled;

    public  Sandwich() {
        this.grilled = false;
    }

    public String getBread() {
        return bread;
    }
    public void setBread(String bread) {
        this.bread = bread;
    }
    public String getMeat() {
        return meat;
    }
    public void setMeat(String meat) {
        this.meat = meat;
    }
    public String getCheese() {
        return cheese;
    }
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    public String getVegetable() {
        return vegetable;
    }
    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }
    public String getSauce() {
        return sauce;
    }
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    public boolean getGrilled() {
        return grilled;
    }
    public void setGrilled(boolean grilled) {
        this.grilled = grilled;
    }
    public void showIngredients() {
        System.out.println("Sandwich : ");
        System.out.println("bread : " + bread);
        if (meat != null) {
            System.out.println("meat : " + meat);
        }
        if (cheese != null) {
            System.out.println("cheese : " + cheese);
        }
        if (vegetable != null) {
            System.out.println("vegetable : " + vegetable);
        }
        if (sauce != null) {
            System.out.println("sauce : " + sauce);
        }
        System.out.println("grilled : " + grilled);
        System.out.println("-------------------------");
    }
}
