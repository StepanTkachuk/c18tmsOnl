public class Task5 {
    public static void main(String[] args) {
        System.out.println(summ(2, 3));
    }

    //        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ в методе main и распечатайте на консоль.
    public static int summ(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum = sum + a;
        }
        return sum;
    }
}
