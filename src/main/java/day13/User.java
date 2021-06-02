package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    List<User> subscriptions;


    public User(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        subscriptions.add(user);
        System.out.println(name + " ПОДПИСАЛСЯ на " + user.name);
    }

    public boolean isSubscribed(User user) {
        if (subscriptions.contains(user)) {
            System.out.println(name + " подписан на " + user.name);
            return true;
        } else {
            System.out.println(name + " НЕ подписан на " + user.name);
            return false;
        }
    }

    public boolean isFriend(User user) {
        if (subscriptions.contains(user) && user.getSubscriptions().contains(this)) {
            System.out.println(this.name + " друзья с " + user.name);
            return true;
        } else {
            System.out.println(name + " Не являються друзьями с " + user.name);
            return false;
        }
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }


    public String getName() {
        return name;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
