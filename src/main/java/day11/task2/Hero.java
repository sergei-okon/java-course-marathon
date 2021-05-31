package day11.task2;

public abstract class Hero {
    private int health;
    private int physDef;
    private int magicDef;

    public Hero(int health, int physDef, int magicDef) {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    public int getHealth() {
        return health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}