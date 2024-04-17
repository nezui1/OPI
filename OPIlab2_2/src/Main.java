import Bobazhanova.ArrayPrinter;
import Klykov.ArrayRandomFiller;
import Zolotov.SumOdd;


public class Main {
    public static void main(String[] args) {

        int origin = -10;

        int bound = 10;

        int len = 10;

        int[] arr = new int[len];

        ArrayRandomFiller.fillArrayWithRandom(arr, origin,bound);

        ArrayPrinter.printArray(arr);

        int k = SumOdd.findSumOdd(arr);

        System.out.println("\n" + k);
    }
}