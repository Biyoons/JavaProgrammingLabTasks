import java.util.Random;

public class ArrayMinMaxExample {
    public static void main(String[] args) {

        int[] numbers = new int[10];


        Random rand = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }


        int smallest = numbers[0];
        int largest = numbers[0];


        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }


        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }


        System.out.println("\nSmallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
