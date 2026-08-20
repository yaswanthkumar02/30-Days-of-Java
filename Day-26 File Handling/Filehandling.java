import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class Filehandling {
    public static void main(String[] args) {
    try {  
            File file = new File("student.txt");
            file.createNewFile();
        
            FileWriter writer = new FileWriter(file);
            writer.write("Name: Yaswanth\n");
            writer.write("Course: BCA\n");
            writer.write("Age: 21");
            writer.close();

            FileReader reader = new FileReader(file);
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}

