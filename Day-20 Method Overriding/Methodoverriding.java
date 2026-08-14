 class person {
 String name;
 int age;
   person(String name, int age) {
    this.name=name;
    this.age=age; }
   
   void display() {
    System.out.println("Name: "+name);
    System.out.println("Age: "+age); 
      }
   }
   class student extends person {
      String course;
      student(String name, int age, String course) {
      super(name, age);
      this.course = course;
      }
      void display() {
        System.out.println("\nName   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Role   : Student");
        System.out.println("Course : " + course);
        System.out.println();
       }
    }
 public class Methodoverriding {
   public static void main(String[] args) {
    person person = new student("Kumar", 21, "Computer Science");
     person.display(); 
   }
}

