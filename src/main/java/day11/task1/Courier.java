package day11.task1;

public class Courier implements Worker {
    private static final int SALARY_AMOUNT = 100;
    private static final int BONUS_AMOUNT = 70000;
    private static final int MIN_ORDERS_FOR_BONUS_PAYMENT = 10000;
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;


    @Override
    public void doWork() {
        salary = salary + SALARY_AMOUNT;
        warehouse.incrementCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < MIN_ORDERS_FOR_BONUS_PAYMENT) {
            System.out.println("Бонус пока не доступен (курьер)");

        } else if (isPayed == true) {
            System.out.println("Бонус уже выплачивался (курьер)");

        } else {
            System.out.println("Выплачиваеться бонус сотруднику (курьер)");
            salary = salary + BONUS_AMOUNT;
            setPayed(true);
        }
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
