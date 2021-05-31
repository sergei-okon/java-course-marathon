package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int physAtt;  //(величина физической атаки)
    private int magicAtt;

    public Magician() {
        super(100, 0, 80);
        this.physAtt = 5;
        this.magicAtt = 20;
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
    public void magicalAttack(Hero hero) {
        int volumeDamage = magicAtt - (magicAtt * hero.getMagicDef() / 100);
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
        return "Magician{" +
                "health=" + getHealth() +
                '}';
    }
}
