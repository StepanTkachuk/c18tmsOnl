public class Task5 {
    //    *  5*)со звездочкой! В метод на вход приходит строка
//     *
//             *  public static boolean validate(String str) {
//        return false;
//    }
//     * Необходимо выполнить проверку на валидацию входящей строки и вернуть false или true
//            * - Строка должна содержать только маленькие латинские буквы и цифры 1 или 5 без знака подчеркивания.
//     * - Длина строки должна быть от 4 до 20 символов.

    public static void main(String[] args) {
        System.out.println(validate("5555azaza5555azazazz"));
        System.out.println(validate("5555azaza5555azazazz"));
        System.out.println(validate("15"));
        System.out.println(validate("15"));
        System.out.println(validate("151.11"));
        System.out.println(validate("ad15c"));
    }

    private static boolean validate(String string) {
        return string.matches("[a-z.,15]");
    }
}
