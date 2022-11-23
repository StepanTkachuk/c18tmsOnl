package Task1;

public class Person {
    String name;
    int age;
    String sex;
    Address address;
    String allInfo;


    public Person(String name, int age, String sex, Address address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Address getAddress() {
        return address;
    }

    public String getAllInfo() {
        return name + " " + age + " " + sex + " " + address.getAllAddress();
    }
}
