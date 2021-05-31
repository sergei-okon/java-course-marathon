package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt;

    public Magician() {
        super(5, 0, 80);
        this.magicAtt = 20;
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
    public String toString() {
        return "Magician{" +
                "health=" + getHealth() +
                '}';
    }
}
