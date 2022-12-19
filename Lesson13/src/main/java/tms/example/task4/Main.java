package tms.example.task4;

public class Main {
    public static void main(String[] args) {
        String str = "Я проснулся и умылся. Я пошёл на работу. На обеде казак сходил в магазин. Ты поел. Шалаш большой.";
        TextFormatter textFormatter = new TextFormatter();
        String[] strings = str.split("\\.");
        for (int i = 0; i < strings.length; i++) {
            if (textFormatter.isPalindrome(strings[i].trim()) ||
                    textFormatter.returnCountWord(strings[i].trim()) > 3 &&
                            textFormatter.returnCountWord(strings[i].trim()) < 5) {
                System.out.println(strings[i].trim());
            }
        }
    }
}
