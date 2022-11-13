public class Task1 {
    public static void main(String[] args) {
        daysOfTheWeek();
    }

    //1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
    public static void daysOfTheWeek() {
        int random = 1 + (int) (Math.random() * 7);
        switch (random) {
            case (1) -> System.out.println("Понедельник");
            case (2) -> System.out.println("Вторник");
            case (3) -> System.out.println("Среда");
            case (4) -> System.out.println("Четверг");
            case (5) -> System.out.println("Пятница");
            case (6), (7) -> System.out.println("Выходные");
        }
    }
}
