package tms.example;

public class Task7 {
    /*    * 7*(Можно не делать!))Найти количество слов, содержащих только символы латинского алфавита. Пример:
     * "Методы доступа называют ещё аксессорами (от англ. access — доступ),
     *  или по отдельности — геттерами (англ. get — чтение)  and сеттерами (англ. set — запись)"*/
    public static void main(String[] args) {
        String string = "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности —\n" +
                "геттерами (англ. get — чтение) and сеттерами (англ. set — запись) hello world аfrica";
        System.out.println("Слов, написанных латиницей: " + getCountEnglishWords(string));
    }

    private static int getCountEnglishWords(String string) {
        int count = 0;
        String[] strings = string.split(" ");
        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) {
                count++;
            }
        }
        return count;
    }
}
