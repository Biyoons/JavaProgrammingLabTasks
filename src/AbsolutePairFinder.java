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
        int firstNumber = 0;
        int secondNumber = 0;
        int maxAbsoluteSum = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = Math.abs(array[i]) + Math.abs(array[j]);
                if (sum > maxAbsoluteSum) {
                    maxAbsoluteSum = sum;
                    firstNumber = array[i];
                    secondNumber = array[j];
                }
            }
        }

        if (maxAbsoluteSum > 0) {
            System.out.println("For array: " + java.util.Arrays.toString(array) +
                    ", the highest absolute pair is: " + firstNumber + " and |" + secondNumber + "|");
        } else {
            System.out.println("For array: " + java.util.Arrays.toString(array) +
                    ", there is no pair of absolute numbers.");
        }
    }
}
