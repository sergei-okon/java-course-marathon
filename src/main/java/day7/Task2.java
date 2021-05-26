package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int min = 90;
        int max = Player.MAX_STAMINA;
        Random random = new Random();

        Player player1 = new Player(random.nextInt(max - min) + min);
        Player player2 = new Player(random.nextInt(max - min) + min);
        Player player3 = new Player(random.nextInt(max - min) + min);
        Player player4 = new Player(random.nextInt(max - min) + min);
        Player player5 = new Player(random.nextInt(max - min) + min);
        Player player6 = new Player(random.nextInt(max - min) + min);

        Player.info();

        Player player7 = new Player(random.nextInt(max - min) + min);
        Player player8 = new Player(random.nextInt(max - min) + min);

        System.out.println("Кол-во игроков на поле " + Player.getCountPlayers());//Проверка сколько игроков на поле после создани 7 и 8 игрока

        int staminaRunPlayer = player2.getStamina();
        for (int i = 0; i < staminaRunPlayer; i++) {
            player2.run();
            System.out.println(player2.getStamina());
        }

        System.out.println("Кол-во игроков на поле " + Player.getCountPlayers());
        Player.info();
    }
}
