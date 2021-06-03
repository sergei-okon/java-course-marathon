package day15;

public class Shoes {
    private String name;
    private int size;
    private int stockBalance;

    public Shoes(String name, int size, int stockBalance) {
        this.name = name;
        this.size = size;
        this.stockBalance = stockBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name +
                ", " + size +
                ", " + stockBalance
                ;
    }
}
