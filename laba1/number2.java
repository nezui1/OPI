import java.util.Arrays;
import java.util.Scanner;
public class number2 {
    public static int PoiskMinC(int x[][], int m, int n){
        int min_chislo = 100000;
        int stolb = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if( x[i][j] % 2 == 0 & x[i][j] < min_chislo ){
                    stolb = j;
                }
            }
        }
        return stolb;
    }
    public static int PoiskMaxN(int x[][], int m, int n){
        int max_chislo = -100000;
        int stolb = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if( x[i][j] % 2 != 0 || x[i][j] > max_chislo ){
                    stolb = j;
                }
            }
        }
        return stolb;
    }
    public static void OutputX(int x[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void Permutation(int x[][], int n, int m, int e, int r){
        for (int i = 0; i < n; i++){
            int temp = x[i][e];
            x[i][e] = x[i][r];
            x[i][r] = temp;
        }
    }

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите n:");
        int n = in.nextInt();

        System.out.print("Введите n:");
        int m = in.nextInt();

        int[][] x = new int[n][m];

        System.out.print("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = in.nextInt();
            }
        }

        System.out.print("Массив x:\n");
        OutputX(x,n,m);
        int StolbMinC = PoiskMinC(x,m,n);
        int StolbMaxN = PoiskMaxN(x,m,n);
        Permutation(x,m,n,StolbMinC,StolbMaxN);
        System.out.print("Массив x после обработки:\n");
        OutputX(x,n,m);
        }
}

