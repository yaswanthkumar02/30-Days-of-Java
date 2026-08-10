class Student {
  
    int studentId;
    String studentName;
    int age;
    String course;
  
    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
  
    public static void main(String[] args) {
        System.out.println();
        Student s = new Student();
      
        s.studentId = 11;
        s.studentName = "Yaswanth";
        s.age = 21;
        s.course = "BCA";       
        
        s.displayDetails();
        System.out.println();
    }
}

