import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Task2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите день");
        int day = SCANNER.nextInt();
        System.out.println("Введите месяц");
        int month = SCANNER.nextInt();
        System.out.println("Введите год");
        int year = SCANNER.nextInt();
        try {
            LocalDate localDate = LocalDate.of(year, month, day);
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            System.out.println("Today is: " + dayOfWeek);
            switch (dayOfWeek) {
                case MONDAY -> System.out.println(localDate.plusDays(8));
                case TUESDAY -> System.out.println(localDate.plusDays(7));
                case WEDNESDAY -> System.out.println(localDate.plusDays(6));
                case THURSDAY -> System.out.println(localDate.plusDays(5));
                case FRIDAY -> System.out.println(localDate.plusDays(4));
                case SATURDAY -> System.out.println(localDate.plusDays(3));
                case SUNDAY -> System.out.println(localDate.plusDays(2));
                default -> System.out.println("Something went wrong");
            }
        } catch (Exception e) {
            System.out.println("Invalid data");
        }
    }
}
