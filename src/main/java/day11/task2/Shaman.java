package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private int physAtt;
    private int magicAtt;
    private int healHimself;
    private int healTeammate;

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

    public Shaman() {
        super(100, 20, 20);
        this.physAtt = 10;
        this.magicAtt = 15;
        this.healHimself = 50;
        this.healTeammate = 30;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
