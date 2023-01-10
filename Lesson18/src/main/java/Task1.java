import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите день");
        int day = SCANNER.nextInt();
        System.out.println("Введите месяц");
        int mouth = SCANNER.nextInt();
        System.out.println("Введите год");
        int year = SCANNER.nextInt();
        try {
            LocalDate localDate = LocalDate.of(year, mouth, day);
            System.out.println(localDate.getDayOfWeek());
        } catch (Exception e) {
            System.out.println("Invalid data");
        }
    }
}
