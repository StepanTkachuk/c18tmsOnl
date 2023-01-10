package task3;

public class FunctionalInterfaceExample {
    public static void fooInt(int num) {
        if (num == 1) {
            Int<String> stringReverse = s -> System.out.println(new StringBuilder(s).reverse());
            stringReverse.foo("abc");
        } else if (num == 2) {
            Int<Integer> intFactorial = number -> {
                int result = 1;
                for (int i = 1; i <= number; i++) {
                    result = result + 1;
                }
                System.out.println(result);
            };
            intFactorial.foo(5);
        }
    }

    public static void main(String[] args) {
        fooInt(1);
        fooInt(2);
    }
}
