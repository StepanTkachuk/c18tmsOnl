package org.example;

public class User {
    @Deprecated
    public String allInfo() {
        return fistName + " " + lastName + " " + sex + " " + age;
    }

    public int addAge(int value) {
        return age + value;
    }

    public String nameAndFirstName() {
        return fistName + " " + lastName;
    }

    public User() {
    }

    public User(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }


    public User(String sex, int age, String fistName, String lastName) {
        this(fistName, lastName);
        this.sex = sex;
        this.age = age;
    }

    String fistName;
    String lastName;
    String sex;
    int age;


}
