package Task2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

//2) Определение количества четных чисел в потоке данных.
//        * Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
public class Main {
    public static void main(String[] args) {
        Set<Integer> integerList = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            integerList.add(random.nextInt(101));
        }
        System.out.println(integerList);
        System.out.println(integerList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toSet())
                .size());
    }
}
