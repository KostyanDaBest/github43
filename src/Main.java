import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Индекс минимального элемента: " + minIndex);

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}