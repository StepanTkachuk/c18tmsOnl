public class Task6 {
    public static void main(String[] args) {
        drawTwoDimensionalArray();
    }
    //        6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

    //        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
    public static void drawTwoDimensionalArray() {
        String[][] array = {
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"}};
        System.out.println("Вариант A");
        System.out.println(" " + " " + " " + array[0][3]);
        System.out.println(" " + " " + array[1][2] + array[1][1]);
        System.out.println(" " + array[2][1] + array[2][2] + array[2][3]);
        System.out.println(array[3][0] + array[3][1] + array[3][2] + array[3][2]);
        System.out.println("Вариант B");
        System.out.println(array[0][0]);
        System.out.println(array[1][0] + array[1][2]);
        System.out.println(array[2][0] + array[2][1] + array[2][3]);
        System.out.println(array[3][0] + array[3][1] + array[3][2] + array[3][2]);
        System.out.println("Вариант C");
        System.out.println(array[0][0] + array[0][1] + array[0][2] + array[0][3]);
        System.out.println(" " + array[1][1] + array[1][1] + array[1][2]);
        System.out.println(" " + " " + array[2][2] + array[2][3]);
        System.out.println(" " + " " + " " + array[3][3]);
        System.out.println("Вариант D");
        System.out.println(array[0][0] + array[0][1] + array[0][2] + array[0][3]);
        System.out.println(array[1][0] + array[1][1] + array[1][2] + " ");
        System.out.println(array[2][0] + array[2][1] + " " + " ");
        System.out.println(array[3][0] + " " + " " + " ");
    }
}
