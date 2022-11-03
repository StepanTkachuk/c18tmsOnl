public class Task1 {
    public static void main(String[] args) {

        englishAlphabet();
    }

//  1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита

    public static void englishAlphabet() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
    }
}
