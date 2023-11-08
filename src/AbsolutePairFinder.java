import java.util.Arrays;

public class AbsolutePairFinder {

    public static void main(String[] args) {
        int[] tab1 = {3, 2, -2, 5, -3};
        printAbsolutePair(tab1);

        int[] tab2 = {1, 1, 2, -1, 2, -1};
        printAbsolutePair(tab2);

        int[] tab3 = {1, 2, 3, -4};
        printAbsolutePair(tab3);

        int[] tab4 = {1, 1};
        printAbsolutePair(tab4);
    }

    public static void printAbsolutePair(int[] array) {
        if (array.length < 2) {
            System.out.println("For array: " + Arrays.toString(array) +
                    ", there is no pair of absolute numbers.");
            return;
        }

        int firstNumber = Integer.MIN_VALUE;
        int secondNumber = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            if (Math.abs(currentNumber) > Math.abs(firstNumber)) {
                secondNumber = firstNumber;
                firstNumber = currentNumber;
            } else if (Math.abs(currentNumber) > Math.abs(secondNumber)) {
                secondNumber = currentNumber;
            }
        }

        System.out.println("For array: " + Arrays.toString(array) +
                ", the highest absolute pair is: " + firstNumber + " and " + secondNumber);
    }
}
