package task5;

import task5.model.Person;

import java.util.*;

// 5) Задан список сотрудников, которые хранятся в коллекции List<p3.Person>.
//        * Объект сp3.Person одержит имя и фамилию(по желанию другие данные)
//        *  a) написать метод, который отображает все фамилии, начинающиеся на букву "Д".
//        *     Внимание! метод должен вернуть объект Optional<String>.
//        *  b*)Со звездочкой. Написать метод, который будет выводить в столбик первую букву фамилии и рядом количество сотрудников,
//        *  у которых фамилия начинается с этой буквы.
//        *  Пример: Антонов, Петров, Сидоров, Александров...
//        *  на экран выведет:
//        *  A - 2 сотрудника
//        *  П - 1 сотрудник
//        *  С - 1 сотрудник
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Александр", "Добряков"));
        people.add(new Person("Павел", "Джавов"));
        people.add(new Person("Степан", "Хондоводов"));
        people.add(new Person("Андрей", "Питонов"));
        findSecondName(people);
        printCountEmployees(people);
    }

    public static Optional<String> findSecondName(List<Person> people) {
        System.out.println(people.stream()
                .map(Person::getSecondName)
                .filter(secondName -> secondName.charAt(0) == 'Д')
                .toList());
        return Optional.empty();
    }

    public static void printCountEmployees(List<Person> people) {
        Map<Character, Integer> result = new HashMap<>();
        people.stream()
                .map(Person::getSecondName)
                .forEach(secondName -> {
                    if (result.containsKey(secondName.charAt(0))) {
                        result.put(secondName.charAt(0), result.get(secondName.charAt(0)) + 1);
                    } else {
                        result.put(secondName.charAt(0), 1);
                    }
                });
        result.entrySet().forEach(System.out::println);
    }
}
