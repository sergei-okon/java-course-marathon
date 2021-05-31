package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int physAtt;

    public Warrior() {
        super(100, 80, 0);
        this.physAtt = 30;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int volumeDamage = physAtt - (physAtt * hero.getPhysDef() / 100);
        if ((hero.getHealth() - volumeDamage) > 0) {
            hero.setHealth(hero.getHealth() - volumeDamage);
            System.out.println(hero);
        } else {
            hero.setHealth(0);
            System.out.println(hero);
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() +
                '}';
    }
}



