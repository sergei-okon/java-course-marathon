package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static private List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static void showDialog(User u1, User u2) {
        for (Message m : messages) {
            if ((m.getSender() == u1 && m.getReceiver() == u2) || (m.getReceiver() == u1 && m.getSender() == u2)) {
                System.out.println(m.getSender().getName() + ": " + m.getText());
            }
        }
    }

    public static List<Message> getMessages() {
        return messages;
    }
}
