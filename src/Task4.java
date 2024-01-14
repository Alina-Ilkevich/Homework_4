import java.util.Scanner;

public class Task4 {
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
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Массив не содержит нулевых элементов");
        }
        else {
            System.out.println("Количество нулевых элементов: " + counter);
        }
    }
}
