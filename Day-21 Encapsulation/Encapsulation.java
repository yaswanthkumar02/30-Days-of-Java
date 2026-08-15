  class Student{
   private int id;
   private String name;
   private int marks;

     public void setid(int id){
        this.id=id;
     }
     public int getid (){
        return id;
     }

     public void setname(String name){
        this.name=name;
     }
     public String getname (){
        return name;
     }

     public void setmarks(int marks){
      this.marks=marks;
     }
        public int getmarks(){
        return marks;
     }
    
    }

    public class Encapsulation {
      
    public static void main(String[] args) {
        Student obj= new Student();
        obj.setid(116123);
        obj.setname("yash");
        obj.setmarks(77);

        System.out.println("\nId : "+ obj.getid());
        System.out.println("Name : "+ obj.getname());
        System.out.println("Marks : "+ obj.getmarks());  
        System.out.println();
      
      }
      
    }

   
