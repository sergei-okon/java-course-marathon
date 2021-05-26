package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длинее");

        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолет длинее");

        } else {
            System.out.println("Самолеты равны по длине");
        }
    }

    void info() {
        System.out.println("Изготовитель: " + producer + " год выпуска: " + year + " длина: " + length + " вес: "
                + weight + " Кол-во топлива в баке " + fuel);
    }

    void fillUp(int n) {
        fuel = n + fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getProducer() {
        return producer;
    }

    public int getLength() {
        return length;
    }
}
