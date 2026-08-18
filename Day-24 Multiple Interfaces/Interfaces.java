interface Employee {
    void work();
    void checkErrors();
   }
class Developer implements Employee {
    public void work() {
        System.out.println("\nDeveloper is writing code"); }
    public void checkErrors() {
        System.out.println("Developer is checking errors in the code"); }
  }
class Tester implements Employee {
    public void work() {
        System.out.println("Tester is testing the application");
    }
    public void checkErrors() {
        System.out.println("Tester is finding errors in the application");
    }
  }
public class Interfaces {
    public static void main(String[] args) {
        Employee dev = new Developer();
        Employee tester = new Tester();
        dev.work();
        dev.checkErrors();
        tester.work();
        tester.checkErrors(); }
  }

