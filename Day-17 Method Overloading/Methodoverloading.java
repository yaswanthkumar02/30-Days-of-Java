class sum{
    int add(int a, int b){
        return a+b;
    }
    double add (double a , double b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a+b+c;
    }
}
public class Methodoverloading {
    public static void main(String[] args) {
      
    sum c =new sum();
    System.out.println("\nSum of two integers  : "+ c.add(11,22));
    System.out.println("Sum of two doubles   : "+ c.add(7.33,18.45));
    System.out.println("Sum of three integers: "+ c.add(9,18,11));
    System.out.println(" ");

    }
}


