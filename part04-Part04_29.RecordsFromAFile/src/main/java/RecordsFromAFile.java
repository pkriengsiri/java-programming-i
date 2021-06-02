
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        
        String fileName = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            
            while(fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                
                if(row.isEmpty()) {
                    continue;
                } 
                
                String[] data = row.split(",");
                
                String name = data[0];
                String age = data[1];
                System.out.println(name+", age: "+age+" years");
                
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }

    }
}
