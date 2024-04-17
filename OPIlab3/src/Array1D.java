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
            array1D[i] = random.nextInt(-100, 100);
        }
    }

    public void printArray1D() {
        for (int num : array1D) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int QuantityFirstLast() {
         int x = Math.abs(array1D[0] - array1D[array1D.length]);
         int k = 0;
         for(int i = 0; i < array1D.length; i++){
             if(array1D[i] % x == 0){
                 k++;
             }


        }
         return k;
    }

    protected int MaxNegative() {
        int max = -1000000000;
        for(int i = 0; i < array1D.length; i++){
            if (array1D[i] < 0 && array1D[i] > max){
                max = array1D[i];
            }
        }
        return max;
    }

    protected int MinPositive() {
        int min = 1000000000;
        for(int i = 0; i < array1D.length; i++){
            if (array1D[i] > 0 && array1D[i] < min){
                min = array1D[i];
            }
        }
        return min;
    }


    protected int AVGMultipleOfThree() {
        int k = 0;
        int sum = 0;
        for(int i = 0; i < array1D.length; i++){
            if(array1D[i] % 3 == 0){
                sum+=array1D[i];
                k++;
            }
        }
    return (sum/k);
    }
}
