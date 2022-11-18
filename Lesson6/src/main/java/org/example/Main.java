package org.example;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Stepan", "Tkachuk");
        User user2 = new User("female", 23, "Yulia", "Tkachuk");
        user1.sex = "male";
        user1.age = 24;
        System.out.println(user1.nameAndFirstName());
        System.out.println(user1.addAge(2));
        System.out.println(user1.allInfo());
        System.out.println(user2.allInfo());
    }
}