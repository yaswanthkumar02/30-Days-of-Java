abstract class student {
    int studentid;
    String studentname;

    student(int studentid, String studentname) {
        this.studentid = studentid;
        this.studentname = studentname;
    }
    abstract void calculategrade();

    void displaystudent() {
        System.out.println("\nStudent ID   : " + studentid);
        System.out.println("Student Name : " + studentname);
    }
}

class student1 extends student {
    int marks;

    student1(int studentid, String studentname, int marks) {
        super(studentid, studentname);
        this.marks = marks;
    }
    void calculategrade() {
        if (marks >= 90) {
            System.out.println("Grade        : A");
        } else if (marks >= 75) {
            System.out.println("Grade        : B");
        } else if (marks >= 60) {
            System.out.println("Grade        : C");
        } else if (marks >=50){
            System.out.println("Grade        : D");
        }else if(marks >=40){
            System.out.println("Grade        : E");
        }else 
            System.out.println("Fail");
    }

}
public class Abstraction {
    public static void main(String[] args) {

        student student = new student1
        (101,"Yaswanth",85);
        student.displaystudent();
        student.calculategrade();
    }
}


