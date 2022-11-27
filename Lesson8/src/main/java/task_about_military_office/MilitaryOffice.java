package task_about_military_office;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void getRecruitsByAge() {
        int count = 0;
        System.out.println("Ищем всех мужчин с возрастом от 18 до 27");
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (personRegistry.getPersons()[i].getAge() >= 18 && personRegistry.getPersons()[i].getAge() <= 27 && personRegistry.getPersons()[i].getSex().equals("male")) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void getRecruitsByCity() {
        int count = 0;
        System.out.println("Ищем всех мужчин из города Минск с возрастом от 18 до 27 ");
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (personRegistry.getPersons()[i].getAge() >= 18 && personRegistry.getPersons()[i].getAge() <= 27 && personRegistry.getPersons()[i].getAddress().city.equals("Minsk")) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void getAllPeopleByAge() {
        int count = 0;
        System.out.println("Ищем всех с возрастом от 25 до 27");
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (personRegistry.getPersons()[i].getAge() >= 25 && personRegistry.getPersons()[i].getAge() <= 27) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void getRecruitsWithAleksandrName() {
        int count = 0;
        System.out.println("Ищем всех с именем Александр");
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (personRegistry.getPersons()[i].getName().equals("Aleksandr")) {
                count++;
            }
        }
        System.out.println(count);
    }
}