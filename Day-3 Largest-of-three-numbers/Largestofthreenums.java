import java.util.Scanner;
public class Largestofthreenums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        System.out.print("Enter the third number : ");
        int z = sc.nextInt();

        if (x > y && x > z ) {
            System.out.println(x + " is the largest.");} 
        else if(y > z && y > x) {
            System.out.println(y + " is the largest");
        } else 
            System.out.println(z + " is the largest");

            sc.close();
    }
}
