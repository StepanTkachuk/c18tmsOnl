import tms.example.utils.PatternUtils;

import java.util.regex.Matcher;

public class Task2 {
    /**
     * По  регулярным выражениям!
     * 2) Дана строка "cab, ccab, cccab"
     * Необходимо составить регулярное выражение, сделать класс Pattern, Matcher,
     * вызвать метод find и вывести слова на консоль
     * Должно вывести:
     * cab
     * ccab
     * cccab
     */
    public static void main(String[] args) {
        String text = "cab, ccab, cccab";
        Matcher matcher = PatternUtils.PATTERN.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
