package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior1.physicalAttack(paladin); //Воин атакует Паладина

        paladin.physicalAttack(magician); //Паладин атакует Мага

        shaman.healTeammate(magician); //Шаман лечит Мага

        magician.magicalAttack(paladin); //Маг атакует Паладина, тип атаки М

        shaman.physicalAttack(warrior1); //Шаман атакует Воина, тип атаки Ф

        paladin.healHimself(); //Паладин лечит себя

        warrior1.physicalAttack(magician); //Воин атакует Мага 5 раз
        warrior1.physicalAttack(magician); //Воин атакует Мага 5 раз
        warrior1.physicalAttack(magician); //Воин атакует Мага 5 раз
        warrior1.physicalAttack(magician); //Воин атакует Мага 5 раз
        warrior1.physicalAttack(magician); //Воин атакует Мага 5 раз
    }
}

