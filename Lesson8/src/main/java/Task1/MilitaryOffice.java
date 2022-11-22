package Task1;

import java.util.Scanner;

public class MilitaryOffice {
    PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void printRecruits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип сортировки");
        System.out.println("1 - Ищем всех мужчин с возрастом от 18 до 27 ");
        System.out.println("2 - Ищем всех мужчин из города Минск с возрастом от 18 до 27 ");
        System.out.println("3 - Ищем всех с возрастом от 25 до 27 ");
        System.out.println("4 - Ищем всех с именем Александр ");
        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("Выбрана сортировка под номером 1");
                System.out.println("Ищем всех мужчин с возрастом от 18 до 27");
                for (int i = 0; i < personRegistry.getPersons().length; i++) {
                    if (personRegistry.getPersons()[i].getAge() >= 18 && personRegistry.getPersons()[i].getAge() <= 27 && personRegistry.getPersons()[i].getSex().equals("male")) {
                        System.out.println(personRegistry.getPersons()[i].getAllInfo());
                    }
                }
            }
            case 2 -> {
                System.out.println("Выбрана сортировка под номером 2");
                System.out.println("Ищем всех мужчин из города Минск с возрастом от 18 до 27 ");
                for (int i = 0; i < personRegistry.getPersons().length; i++) {
                    if (personRegistry.getPersons()[i].getAge() >= 18 && personRegistry.getPersons()[i].getAge() <= 27 && personRegistry.getPersons()[i].getAddress().city.equals("Минск")) {
                        System.out.println(personRegistry.getPersons()[i].getAllInfo());
                    }
                }
            }
            case 3 -> {
                System.out.println("Выбрана сортировка под номером 3");
                System.out.println("Ищем всех с возрастом от 25 до 27");
                for (int i = 0; i < personRegistry.getPersons().length; i++) {
                    if (personRegistry.getPersons()[i].getAge() >= 25 && personRegistry.getPersons()[i].getAge() <= 27) {
                        System.out.println(personRegistry.getPersons()[i].getAllInfo());
                    }
                }
            }
            case 4 -> {
                System.out.println("Выбрана сортировка под номером 4");
                System.out.println("Ищем всех с именем Александр");
                for (int i = 0; i < personRegistry.getPersons().length; i++) {
                    if (personRegistry.getPersons()[i].getName().equals("Александр")) {
                        System.out.println(personRegistry.getPersons()[i].getAllInfo());
                    }
                }
            }
        }
    }
}
