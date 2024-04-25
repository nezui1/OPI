public class Main {
    public static void main(String[] args) {
//        task1();
   //     task2();
     task3();
    }

    private static void task1() {
        Array1D array1D = new Array1D();
        array1D.printArray1D();
        int count = array1D.QuantityFirstLast();
        System.out.println(count);
    }

    private static void task2() {
        Array2D array2D = new Array2D();
        array2D.printArray2D();
        System.out.println(array2D.MaxNegative());
        System.out.println(array2D.MinPositive());
        System.out.println(array2D.AVG());
        array2D.Max();

        array2D.printArray2D();
    }

    private static void task3() {
       Array2D array2D = new Array2D();
        array2D.printArray2D();
        int count = array2D.QuantityFirstLast();
        System.out.println("Кол-во кратных разнице первого и последнего элемента = " + count);
        array2D.printArray2D();

   }
}
