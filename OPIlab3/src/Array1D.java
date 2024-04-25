import java.util.Random;
import java.util.Scanner;


public class Array1D {
    protected int[] array1D;

    public Array1D(int a) { }

    public Array1D() {
        Random random = new Random();
        Scanner scannerOfWidth = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        array1D = new int[scannerOfWidth.nextInt()];

        for (int i = 0; i < array1D.length; i++) {
            array1D[i] = random.nextInt(0, 10);
        }
    }

    public void sort1() {
        int n = array1D.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array1D[j] < array1D[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array1D[minIndex];
            array1D[minIndex] = array1D[i];
            array1D[i] = temp;
        }
    }
    public void sort2() {
        int n = array1D.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array1D[j] > array1D[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array1D[minIndex];
            array1D[minIndex] = array1D[i];
            array1D[i] = temp;
        }
    }
    public void printArray1D() {
        for (int num : array1D) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int QuantityFirstLast() {
         int x = Math.abs(array1D[0] - array1D[array1D.length - 1]);
         int k = 0;
         for(int i = 0; i < array1D.length; i++){
             if(array1D[i] % x == 0 && array1D[i] != 0){
                 k++;
             }


        }
         return k;
    }


}
