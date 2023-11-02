import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter a word: ");
        String word = scanner.nextLine().toLowerCase();


        boolean isPalindrome = isPalindrome(word);

        if (isPalindrome) {
            System.out.println("This word is a palindrome.");
        } else {
            System.out.println("This word is not a palindrome.");
        }

        scanner.close();
    }


    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
