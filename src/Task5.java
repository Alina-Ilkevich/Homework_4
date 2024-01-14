import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число: ");
            int val = scan.nextInt();
            arr[i] = val;
        }
        scan.close();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < (arr.length / 2); i++) {
            int a = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = a;
            }
        System.out.println(Arrays.toString(arr));
        }
}
