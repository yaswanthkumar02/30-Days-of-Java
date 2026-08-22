import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
      
        map.put(1, "Charan");
        map.put(2, "Manoj");
        map.put(3, "Karthik");

        System.out.println("\nHashMap: " + map);

        System.out.println("\nValue for key 2: " + map.get(2));

        map.remove(1);

        System.out.println("\nAfter removing key 1: " + map);

        System.out.println("\nSize: " + map.size());
        
        System.out.println();
    }
}

