import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
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
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                System.out.println("Массив не является возрастающим!");
                break;
            } else {
                counter++;
            }
            if (counter == (arr.length - 1)) {
                System.out.println("Массив является возрастающим!");
            }
        }
    }
}
