import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scan.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число: ");
            int val = scan.nextInt();
            arr[i] = val;
        }
        scan.close();
        int max = arr[0];
        int indexMax = 0;
        int min = arr[0];
        int indexMin = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                indexMin = i;
            }
        }
        System.out.println("Максимальное число массива: " +  max + " Индекс этого числа: " + indexMax);
        System.out.println("Минимальное число массива: " + min + " Индекс этого числа: " + indexMin);
    }
}
