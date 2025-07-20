import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {

        try{

           // creating file
            // File file = new File("/Users/perennial/Desktop/doc.txt");

            // if(file.createNewFile()){
            //     System.out.println("File created: " + file.getName());
            // } else {
            //     System.out.println("File already exists.");

            // }


            // writing file
            // FileWriter writer = new FileWriter("/Users/perennial/Desktop/doc.txt");
            // writer.write("this is my first test file ");
            // writer.close();

            // read file
        //    File file = new File("/Users/perennial/Desktop/doc.txt");
        //     Scanner sc = new Scanner(file);
        //     while(sc.hasNextLine()){
        //         String data = sc.nextLine();
        //         System.out.println(data);
// 
            // }


            // checking file properties
            // File file = new File("/Users/perennial/Desktop/doc.txt");
            // if(file.exists()){
            //     System.out.println("File exists: " + file.getName());
            //     System.out.println("File size: " + file.length() + " bytes");
            //     System.out.println("File path: " + file.getAbsolutePath());
            //     System.out.println("Is writable: " + file.canWrite());
            //     System.out.println("Is readable: " + file.canRead());
            // } else {
            //     System.out.println("File does not exist.");
            // }


            File file = new File("/Users/perennial/Desktop/doc.txt");
           
            if(file.delete()){
                System.out.println("File deleted successfully: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }



        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            // Cleanup code if needed
        }
        

    }
    
}
