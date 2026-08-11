class Constructor {
    String name;
    int age;
    Constructor() {
        name = "yaswanth";
        age = 20;
        System.out.println();
    }
    Constructor(String name, int age) {
        this.name = name;
        this.age = age;
        
    }
    void display() {
     
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
    public static void main(String[] args) {
        Constructor s1 = new Constructor();
        Constructor s2 = new Constructor("kumar", 21);

        s1.display();
        s2.display();
    }
}

