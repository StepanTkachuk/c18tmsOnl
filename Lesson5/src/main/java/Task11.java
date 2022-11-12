public class Task11 {
    public static void main(String[] args) {
        arrayDuplicateElements(new int[]{0, 3, 46, 3, 2, 1, 2});
    }

    //        11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void arrayDuplicateElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    System.out.println("Массив имеет повторяющийся элемент " + array[j]);
                }
            }     /////////не смог разобраться как правильно вывести
        }
    }
}

