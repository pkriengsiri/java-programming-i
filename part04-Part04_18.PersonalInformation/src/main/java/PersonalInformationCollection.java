
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First Name: ");

            String firstName = scanner.nextLine();

            if (firstName.equals("")) {
                break;
            }
            
            System.out.println("Last Name: ");
            
            String lastName = scanner.nextLine();
            
            System.out.println("Identification Number: ");
            
            String idNumber = scanner.nextLine();
            
            PersonalInformation userPersonalInformation = new PersonalInformation(firstName, lastName, idNumber);
            
            infoCollection.add(userPersonalInformation);

        }
        
        for(PersonalInformation person: infoCollection) {
            System.out.println(person.getFirstName()+" "+person.getLastName());
        }
    }
}
