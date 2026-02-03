public final class TPE {
    private static TPE instance;
    private static int money;

    private TPE() {
        money = 0;
    }

    public void addMoney(int pMoney) {
        money += pMoney;
    }

    public int getMoney() {
        return money;
    }

    public void resetMoney() {
        money = 0;
    }

    public static TPE getInstance() {
        if (instance == null) {
            instance = new TPE();
        }
        return instance;
    }
}
