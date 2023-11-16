import java.util.Scanner;

public class Person {
    String surname, firstname, street, zipCode, city;

    void initialize(String mySurname, String myStudentID) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Surname: ");
        surname = scanner.nextLine();
        System.out.println("Enter First Name: ");
        firstname = scanner.nextLine();
        System.out.println("Enter Street: ");
        street = scanner.nextLine();
        System.out.println("Enter Zip Code: ");
        zipCode = scanner.nextLine();
        System.out.println("Enter City: ");
        city = scanner.nextLine();
    }

    void print() {
        System.out.println("Name: " + firstname + " " + surname);
        System.out.println("Address: " + street + ", " + city + ", " + zipCode);
    }
}



