package day11.task2;

public class Paladin extends Hero implements Healer {
    private int healHimself;
    private int healTeammate;

    public Paladin() {
        super(15, 50, 20);
        this.healHimself = 25;
        this.healTeammate = 10;
    }

    @Override
    public void healHimself() {
        if ((getHealth() + healHimself) > MAX_HEALTH) {
            setHealth(MAX_HEALTH);
            System.out.println(this.toString());
        } else
            setHealth(getHealth() + healHimself);
        System.out.println(this.toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        if ((hero.getHealth() + healTeammate) > MAX_HEALTH) {
            hero.setHealth(MAX_HEALTH);
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
