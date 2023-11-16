import java.util.Scanner;

public class Staff extends Person {
    String education, position;

    void initialize1(String mySurname, String myStudentID) {
        initialize(mySurname, myStudentID);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Education: ");
        education = scanner.nextLine();
        System.out.println("Enter Position: ");
        position = scanner.nextLine();
    }

    void print1() {
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}