public class TaskDop6 {
    public static void main(String[] args) {
        printPrimeNumbers();
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000.
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        for (int i = 1; i <= 1000; i++) {

            for (int j = 2; j <= i; j++) {

                if (j < i & i % j == 0) {
                    break;
                }
                if (i % j == 0) {
                    System.out.println(i + " - простое число");
                }
            }
        }
    }
}
