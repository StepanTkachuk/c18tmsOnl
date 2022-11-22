package Task1;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[7];
        people[0] = new Person("Stepan", 24, "male", new Address("Belarus", "Minsk"));
        people[1] = new Person("Pavel", 25, "male", new Address("Belarus", "Minsk"));
        people[2] = new Person("Vladimir", 17, "male", new Address("Belarus", "Minsk"));
        people[3] = new Person("Yulia", 24, "female", new Address("Belarus", "Minsk"));
        people[4] = new Person("Andrew", 24, "male", new Address("Belarus", "Brest"));
        people[5] = new Person("Aleksandr", 26, "male", new Address("Belarus", "Minsk"));
        people[6] = new Person("Victor", 38, "male", new Address("Belarus", "Minsk"));
        PersonRegistry personRegistry = new PersonRegistry(people);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        militaryOffice.printRecruits();
    }
}
