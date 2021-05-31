package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;


    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse.countDeliveredOrders++;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен (курьер)");
        } else if (isPayed == true) {
            System.out.println("Бонус уже выплачивался (курьер)");

        } else {
            System.out.println("Выплачиваеться бонус сотруднику (курьер)");
            salary = salary + 70000;
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
