public class exceptionhandling {
    public static void main(String[] args) {
      int a = 18;
       try{
        int result=a%0;
        System.out.println("\n"+result);
        }
       catch(ArithmeticException e){
          System.out.println("\ncan not divide by zeroo...");
       }
      
      int[] arr={2,4,6,8};
    
       try{
        System.out.println(arr[2]+"\n");
          }
       catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index is invalidd...\n");
        } 

    }
}
