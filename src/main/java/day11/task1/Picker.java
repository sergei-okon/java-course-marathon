package day11.task1;

public class Picker implements Worker {
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;

    @Override
    public void doWork() {
        salary = salary + 80;
        warehouse.countPickedOrders++;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен (сборщик)");
        } else if (isPayed == true) {
            System.out.println("Бонус уже выплачивался (сборщик)");

        } else {
            System.out.println("Выплачиваеться бонус сотруднику (сборщик)");
            salary = salary + 70000;
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
