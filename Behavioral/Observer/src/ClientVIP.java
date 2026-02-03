public class ClientVIP {
    private String name;

    ClientVIP(String name) {
        this.name = name;
    }

    public void notifyClient() {
        System.out.println("ClientVIP " + this.name + " notified");
    }
}
