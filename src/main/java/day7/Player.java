package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;
    public static final int MAX_PLAYER = 6;

    void run() {
        stamina = stamina - 1;
        if (stamina == MIN_STAMINA) {
            System.out.println("Игрок уходит с поля");
            countPlayers--;
        } else {
            System.out.println("Игрок бежит");
        }
    }

    static void info() {
        if (countPlayers < MAX_PLAYER) {
            System.out.println("“Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public Player(int stamina) {
        if (countPlayers == 6) {
            return;
        }
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
