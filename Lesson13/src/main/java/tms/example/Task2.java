package tms.example;

public class Task2 {
    /* 2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0 */
    public static void main(String[] args) {
        String str = "абвгшгуйцугвйву";
        System.out.println(str);
        System.out.println("Заменяем все буквы Г на буквы А");
        System.out.println(str.replace(str.charAt(3), str.charAt(0)));
    }
}
