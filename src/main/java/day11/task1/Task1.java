package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println("Кол-во собранных заказов на складе " + warehouse1.getCountPickedOrders());
        System.out.println("Кол-во доставленных заказов " + warehouse1.getCountPickedOrders());
        System.out.println("Зарплата сборщика первого склада " + picker1.getSalary());
        System.out.println("Зарплата курьера первого склада " + courier1.getSalary() + "\n");

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        businessProcess(picker2);
        businessProcess(courier2);

        System.out.println();
        System.out.println("Зарплата сборщика первого склада " + picker1.getSalary());
        System.out.println("Зарплата курьера первого склада " + courier1.getSalary());

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
