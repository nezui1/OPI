public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
    }

    private static void task1() {
        Array1D array1D = new Array1D();
        array1D.printArray1D();
        array1D.sort();
        array1D.printArray1D();
        System.out.println();
    }

    private static void task2() {
        Array2D array2D = new Array2D();
        array2D.printArray2D();
        array2D.swapColumns();
        System.out.println();
        array2D.printArray2D();
        System.out.println();
    }

    private static void task3() {
        Array2D array2D = new Array2D();
        array2D.printArray2D();
        array2D.sortTheLongestLineRow();
        System.out.println();
        array2D.printArray2D();
        System.out.println();
    }
}
