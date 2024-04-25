import java.util.Arrays;
import java.util.Scanner;

public class Array2D extends Array1D {
    private Array1D[] array2D;

    public Array2D() {
        super(0);
        Scanner scannerOfHeight = new Scanner(System.in);

        System.out.print("Введите высоту массива: ");
        array2D = new Array1D[scannerOfHeight.nextInt()];

        for (int i = 0; i < array2D.length; i++) {
            array2D[i] = new Array1D();
        }
    }

    public void Max() {
        if (MaxNegative() > MinPositive()) {
            for (int i = 0; i < array2D.length; i++) {
                array2D[i].sort2();
            }
        } else if (MaxNegative() < MinPositive()){
            for (int i = 0; i < array2D.length; i++) {
                array2D[i].sort1();
            }

        }else{
            return;
        }

    }

    public int QuantityFirstLast() {
        int indexOfLongest = 0;
        for (int i = 1; i < array2D.length; i++) {
            if (array2D[i].array1D.length > array2D[indexOfLongest].array1D.length) {
                indexOfLongest = i;
            }

        }
        return array2D[indexOfLongest].QuantityFirstLast();
    }
    public int MaxNegative(){
        int max = -1000000;
        for(Array1D array1D : array2D){
            for (int num : array1D.array1D) {
                if (num < 0 && num > max){
                    max = num;
                }
            }
            if(max == -1000000) return 0;
        }
        return Math.abs(max);
    }

    public int MinPositive() {
        int min = 100000;
        for (Array1D array1D : array2D) {
            for (int num : array1D.array1D) {
                if (num >= 0 && num < min) {
                    min = num;
                }
            }
            if (min == 100000) return 0;
        }
        return min;
    }

    public int AVG(){

        int count = 0;
        int k = 0;
        for (Array1D array1D : array2D) {
            for (int num : array1D.array1D) {
                if(Math.abs(num) % 3 == 0){
                    count++;
                    k+=Math.abs(num);
                }
            }
            }
        if (count == 0) return 0;
        return (k / count);
    }


    public void printArray2D() {
        for (Array1D array1D : array2D) {
            for (int num : array1D.array1D) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
