public class Promotion {
    private String name;
    private String description;

    public Promotion(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void showPromotion() {
        System.out.println("------------------------------");
        System.out.println(name);
        System.out.println(description);
        System.out.println("------------------------------");
    }
}
