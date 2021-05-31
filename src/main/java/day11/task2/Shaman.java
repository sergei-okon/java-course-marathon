package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private int magicAtt;
    private int healHimself;
    private int healTeammate;

    public Shaman() {
        super(10, 20, 20);
        this.magicAtt = 15;
        this.healHimself = 50;
        this.healTeammate = 30;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int volumeDamage = magicAtt - (magicAtt * hero.getMagicDef() / 100);
        if ((hero.getHealth() - volumeDamage) > MIN_HEALTH) {
            hero.setHealth(hero.getHealth() - volumeDamage);
            System.out.println(hero);
        } else {
            hero.setHealth(MIN_HEALTH);
            System.out.println(hero);
        }
    }

    @Override
    public void healHimself() {
        if ((getHealth() + healHimself) > MAX_HEALTH) {
            setHealth(MAX_HEALTH);
            System.out.println(this.toString());

        } else {
            setHealth(getHealth() + healHimself);
            System.out.println(this.toString());
        }
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
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
