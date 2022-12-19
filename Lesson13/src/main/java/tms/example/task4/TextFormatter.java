package tms.example.task4;

public class TextFormatter {
    public int returnCountWord(String str) {
        String[] strings = str.split(" ");
        return strings.length;
    }

    public boolean isPalindrome(String str) {
        String[] strings = str.toLowerCase().split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals((new StringBuilder(strings[i])).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
