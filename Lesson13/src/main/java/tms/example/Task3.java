package tms.example;

public class Task3 {
    /*3) В массиве находятся слова. Вывести на экран слова палиндромы.*/
    public static void main(String[] args) {
        String[] arrayStr = new String[]{"заказ", "проверка", "казак", "дед", "проверка"};
        for (int i = 0; i < arrayStr.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(arrayStr[i]);
            if (arrayStr[i].equals(String.valueOf((stringBuilder.reverse())))) {
                System.out.println(arrayStr[i]);
            } else {
                System.out.println("Не палиндром");
            }
        }
    }
}
