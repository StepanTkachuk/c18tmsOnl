package task3;

import java.util.ArrayList;
import java.util.List;

//3) Вывести список имен, но с первой заглавной буквой список имен: "john", "arya", "sansa"
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("john", "arya", "sansa"));
        System.out.println(names.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1)).toList());

    }
}
