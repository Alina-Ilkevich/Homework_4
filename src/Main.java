import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scan.nextInt();
        double [] arr = new double[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        System.out.println(Arrays.toString(arr));
    }
}