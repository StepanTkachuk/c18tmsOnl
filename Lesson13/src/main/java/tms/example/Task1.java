package tms.example;

public class Task1 {
    /*1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа(B).*/
    public static void main(String[] args) {
        String str = "приветааапокавввтрям";
        int indexFirstA = str.indexOf("а");
        int indexLastB = str.lastIndexOf("в");
        String str1 = str.substring(indexFirstA, indexLastB + 1);
        System.out.println(str1);
    }
}
