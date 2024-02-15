import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void reverse(int[] x,int r, int l){
        while (l >= r){
            int temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l--;
            r++;
        }
    }
    public static void swap(int[] x,int m, int n){
        reverse(x, 0, m + n - 1);
        reverse(x, 0, n - 1);
        reverse(x, n, m + n - 1);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите m : ");
        int m = in.nextInt();

        System.out.print("Введите n : ");
        int n = in.nextInt();

        int length = n + m;

        int[] x = new int[length];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < length; i++){
            x[i] = in.nextInt();
        }
        System.out.print("Массив x" + Arrays.toString(x) + "\n");
        swap(x,m,n);
        System.out.print("Массив x после обработки" + Arrays.toString(x));
    }
}