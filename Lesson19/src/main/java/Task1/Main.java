package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//1) Вывести список чисел, умноженных на 2. Список чисел задаем рандомно.
public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            integerList.add(random.nextInt(10));
        }
        System.out.println(integerList);
        System.out.println(integerList.stream()
                .map(num -> num * 2)
                .toList());
    }
}
