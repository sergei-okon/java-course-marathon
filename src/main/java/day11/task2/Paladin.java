package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int physAtt;  //(величина физической атаки)
    private int healHimself;
    private int healTeammate;

    public Paladin() {
        super(100, 50, 20);
        this.physAtt = 15;
        this.healHimself = 25;
        this.healTeammate = 10;
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
    public void healHimself() {
        if ((getHealth() + healHimself) > 100) {
            setHealth(100);
            System.out.println(this.toString());
        } else
            setHealth(getHealth() + healHimself);
        System.out.println(this.toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        if ((hero.getHealth() + healTeammate) > 100) {
            hero.setHealth(100);
            System.out.println(hero);
        } else {
            hero.setHealth(hero.getHealth() + healTeammate);
            System.out.println(hero);
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + getHealth() +
                '}';
    }
}
