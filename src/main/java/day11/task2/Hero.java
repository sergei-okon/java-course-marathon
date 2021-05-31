package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;
    private int health;
    private int physAtt;
    private int physDef;
    private int magicDef;

    public Hero(int physAtt, int physDef, int magicDef) {
        this.health = MAX_HEALTH;
        this.physAtt = physAtt;
        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int volumeDamage = physAtt - (physAtt * hero.getPhysDef() / 100);

        if ((hero.getHealth() - volumeDamage) > MIN_HEALTH) {
            hero.setHealth(hero.getHealth() - volumeDamage);
            System.out.println(hero);

        } else {
            hero.setHealth(MIN_HEALTH);
            System.out.println(hero);
        }
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