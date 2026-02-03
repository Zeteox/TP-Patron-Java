void main() {
    TPE tpe1 = TPE.getInstance();
    TPE tpe2 = TPE.getInstance();
    TPE tpe3 = TPE.getInstance();

    System.out.println(tpe1.getMoney());
    System.out.println(tpe2.getMoney());
    System.out.println(tpe3.getMoney());
    tpe1.addMoney(1000);
    tpe2.addMoney(1000);
    tpe3.addMoney(1000);
    System.out.println(tpe1.getMoney());
    System.out.println(tpe2.getMoney());
    System.out.println(tpe3.getMoney());
    tpe2.resetMoney();
    System.out.println(tpe1.getMoney());
    System.out.println(tpe2.getMoney());
    System.out.println(tpe3.getMoney());
}