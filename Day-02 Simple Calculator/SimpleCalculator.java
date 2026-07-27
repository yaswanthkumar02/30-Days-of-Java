import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
         double n1 = sc.nextDouble();

         System.out.print("Enter the second number: ");
         double n2 = sc.nextDouble();

         System.out.print( "Enter an operator ( +,-,*,/,%) ");
         char operator = sc.next().charAt(0);
            
         switch (operator) {
            case '+':
                System.out.println( "Result = " + (n1+n2));
                break;
            case '-':
                System.out.println( "Result = " + (n1-n2));
                break;
            case '*':
                System.out.println("Result = " + (n1*n2)); 
                break;
            case '/':
            if ( n2 != 0) {
                System.out.println("Result = " + (n1/n2));}
                else{
                    System.out.println("Division by zero is not allowed ");
                    }
                break;  
            case '%':
            if (n2 != 0) {
                System.out.println("Result = " + ( n1%n2));
                } else {
                       System.out.println("Modulus by zero is not allowed");
                       } 
                break;         
            default:
                System.out.println("Enter a valid operator");
                break;
            }
         sc.close();
    }
}
    
