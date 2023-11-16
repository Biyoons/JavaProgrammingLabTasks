import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int counter=0;

        System.out.print("Before:\n[");
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.print(", ");

                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
            System.out.print(array[i]);
        }
        System.out.println("]");


        System.out.print("\nAfter:\n[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        for (int i = 0; i < array.length-1; i++) {
            counter++;
            for (int j = 0; j < array.length-1; j++) {
                counter++;
                if (array [j] > array[j+1]){
                    counter++;
                    int greater = array [j];
                    array [j] = array [j+1];
                    array [j+1] = greater;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Number of actions: " + (counter + counter));

        boolean toSort = true;
        for (int i = 0; i < array.length && toSort; i++) {
            toSort = false;
            counter++;
            for (int j = 0; j < array.length-1; j++) {
                counter++;
                System.out.println(Arrays.toString(array));
                if (array [j] > array[j+1]){
                    counter++;
                    int greater = array [j];
                    array [j] = array [j+1];
                    array [j+1] = greater;
                    toSort = true;
                }
            }
        }
        System.out.println(toSort);

    }
}