  class Cars {
    String name;
    double price;
    String color;

    Cars(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Price : " + price + " Lakh");
        System.out.println("Color : " + color);
    }
 }

class BMW extends Cars {
    BMW(String name, double price, String color) {
        super(name, price, color);
    }
}
class Thar extends Cars {
    Thar(String name, double price, String color) {
        super(name, price, color);
    }
}
class Fortuner extends Cars {
    Fortuner(String name, double price, String color) {
        super(name, price, color);
    }
}
public class Inheritance {
    public static void main(String[] args) {

        BMW b = new BMW("M2", 106.50, "Red");
        Thar t = new Thar("ROX 4X4", 22.00, "Black");
        Fortuner f = new Fortuner("Legender 4X4 AT", 48.29, "White");

        System.out.println("=== BMW ===");
        b.display();
        System.out.println();

        System.out.println("=== Thar ===");
        t.display();
        System.out.println();

        System.out.println("=== Fortuner ===");
        f.display();
    }
} 

    

