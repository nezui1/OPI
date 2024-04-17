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

    public void sortTheLongestLineRow() {
        int indexOfLongest = 0;

        for (int i = 1; i < array2D.length; i++) {
            if (array2D[i].array1D.length > array2D[indexOfLongest].array1D.length) {
                indexOfLongest = i;
            }
        }

        array2D[indexOfLongest].sort();
    }

    public void swapColumns() {
        int indexOfLastNegative = array2D[0].getIndexOfLastNegative();
        int indexOfSecondEven = array2D[0].getIndexOfSecondEven();

        if (indexOfLastNegative == -1 || indexOfSecondEven == -1) {
            System.out.println("Такого элемента не существует");
            return;
        }

        for (Array1D array1D : array2D) {
            array1D.swapElements(indexOfLastNegative, indexOfSecondEven);
        }
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
