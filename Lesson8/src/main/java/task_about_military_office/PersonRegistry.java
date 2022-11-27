package task_about_military_office;

public class PersonRegistry {
    private Person persons[];

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }
}
