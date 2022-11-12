public class Task2 {
    public static void main(String[] args) {
        amoeba();
    }
    //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    public static void amoeba() {
        int startValueAmoeba = 1;
        for (int i = 0; i <= 24; i += 3, startValueAmoeba *= 2) {
            System.out.println("Количество амеб через " + i + " равно " + startValueAmoeba);
        }
    }
}
