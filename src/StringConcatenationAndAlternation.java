import java.util.Scanner;

public class StringConcatenationAndAlternation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();


        String concatenated = str1.concat(str2);


        boolean isAlternating = isAlternatingString(concatenated);


        System.out.println("Concatenated string: " + concatenated);
        if (isAlternating) {
            System.out.println("The concatenated string is alternating.");
        } else {
            System.out.println("The concatenated string is not alternating.");
        }

        scanner.close();
    }
    
    public static boolean isAlternatingString(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}
