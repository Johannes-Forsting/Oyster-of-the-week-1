import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] tal = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rotations = 1;
        tal = rotateByN(tal, rotations);
        System.out.println(Arrays.toString(tal));
    }

    private static int[] rotateByN(int[] tal, int rotateNumber) {
        for (int i = 0; i < rotateNumber; i++) {
            int firstElement = tal[0];
            for (int j = 0; j < tal.length - 1; j++) {
                tal[j] = tal[j + 1];
            }
            tal[tal.length - 1] = firstElement;
        }
        return  tal;
    }
}
