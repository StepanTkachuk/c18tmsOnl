public class TaskDop4 {
    public static void main(String[] args) {
        countDevs(3);
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     * @return
     */
    public static void countDevs(int count) {
        int value1 = count % 10;
        int value2 = count % 100;
        if (value2 >= 11 & value2 <= 19) {
            System.out.println(count + " программистов");
        } else if (value1 == 1) {
            System.out.println(count + " программист");
        } else if (value1 >= 2 && value1 <= 5) {
            System.out.println(count + " программиста");
        } else {
            System.out.println(count + " программистов");
        }
    }
}