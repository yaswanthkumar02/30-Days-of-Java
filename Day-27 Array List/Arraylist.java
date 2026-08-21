import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
      
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(6);
        
        System.out.println("\nOriginal ArrayList: " + numbers);

        numbers.set(1, 4);
        numbers.remove(2);

        System.out.println("\nModified ArrayList: " + numbers);
      
        System.out.println("\nSize: " + numbers.size());
      
        System.out.println("\nElements:");
      
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println();
    }
}
