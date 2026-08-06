import java.util.Arrays;
import java.util.Collections;

public class SortinganArray {
    public static void main(String[] args) {
        System.out.println();
        int[] numbers = {18,45,7,33,17};
        Arrays.sort(numbers);
        System.out.println("Ascending Order :");
        System.out.println(Arrays.toString(numbers));

        Integer[] numbersDesc = {18,45,7,33,17};
        Arrays.sort(numbersDesc, Collections.reverseOrder());
        System.out.println("\nDescending Order :");
        System.out.println(Arrays.toString(numbersDesc));

        String[] names = {"String", "Integer", "Int"};
        Arrays.sort(names);
        System.out.println("\nAlphabetical Order : ");
        System.out.println(Arrays.toString(names));
        System.out.println();
    }
}

