package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Sveta");
        User user2 = new User("Sergei");
        User user3 = new User("Bob");

        user1.sendMessage(user2, "Hello, my friend?");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "I'm fine");
        user2.sendMessage(user1, "And you?");
        user2.sendMessage(user1, "There are you?");

        user3.sendMessage(user1, "Привет");
        user3.sendMessage(user1, "АУ, ты где?");
        user3.sendMessage(user1, "Игноришь?");

        user1.sendMessage(user3, "Привет, я дома.");
        user1.sendMessage(user3, "Ты где пропала, три дня звоню?");
        user1.sendMessage(user3, "Деньги есть?");

        user3.sendMessage(user1, "Нема. Не пиши мне больше :)");

        MessageDatabase.showDialog(user1, user3);

    }
}
