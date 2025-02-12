import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverseArray(array);
        System.out.println("Масив в оберненому порядку: " + Arrays.toString(array));

        raiseEvenIndexedElementsToPower(array, 5);
        System.out.println("Масив з елементами, піднесеними до 5-го степеня на парних індексах: " + Arrays.toString(array));


        int maxElement = findMaxElement(array);
        System.out.println("Найбільший елемент масиву: " + maxElement);

        Arrays.sort(array);
        System.out.println("Масив, впорядкований за зростанням: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void raiseEvenIndexedElementsToPower(int[] array, int power) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = (int) Math.pow(array[i], power);
            }
        }
    }
    
    public static int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
