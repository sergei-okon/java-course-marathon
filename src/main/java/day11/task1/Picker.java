package day11.task1;

public class Picker implements Worker {
    private static final int SALARY_AMOUNT = 80;
    private static final int BONUS_AMOUNT = 70000;
    private static final int MIN_ORDERS_FOR_BONUS_PAYMENT = 10000;
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;

    @Override
    public void doWork() {
        salary = salary + SALARY_AMOUNT;
        warehouse.incrementCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < MIN_ORDERS_FOR_BONUS_PAYMENT) {
            System.out.println("Бонус пока не доступен (сборщик)");

        } else if (isPayed == true) {
            System.out.println("Бонус уже выплачивался (сборщик)");

        } else {
            System.out.println("Выплачиваеться бонус сотруднику (сборщик)");
            salary = salary + BONUS_AMOUNT;
            setPayed(true);
        }
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
