import java.util.Arrays;
import java.util.Scanner;

public class Arrayoperations {

    public static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        Arrays.sort(arr);

        System.out.println("\nSorted Array:");
        display(arr);

        System.out.println("\nMaximum Element: " + max );
        System.out.println("Minimum Element: " + min);

        sc.close();
    }
}
