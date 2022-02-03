import java.util.Arrays;

public class MainWithNormalArray {


    public static void main(String[] args) {
        int[] tal = {1, 2, 3, 4, 5, 6};
        int n = 2;
        System.out.println(Arrays.toString(tal));
        tal = rotateByN(tal, n);
        System.out.println(Arrays.toString(tal));
    }

    private static int[] rotateByN(int[] numbers, int n) {

        //Antallet af rotates komprimeres ned til et tal som er mindre end længden af listen
        //Ved ikke om det er snyd i forhold til opgaven men det giver ikke mening at rotere listen mere end den er lang.
        int rotates = n % numbers.length;

        //Her tager jeg det første element i listen og sætter ind i en midlertidig int-variable.
        //Derefter rykker jeg alle tal en gang ned i "indeks" og til sidst tilføjer jeg tallet som jeg tog til siden i slutningen
        for (int i = 0; i < rotates; i++) {
            int firstElement = numbers[0];
            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = firstElement;
        }
        return  numbers;

        //Her er minimum af rotationer altså = (listens længe - 1) * (rotationer % listens længde) + (2 * (rotationer % listens længde))
        //I tilfældet her med en liste på 6 elementer og rotation på 2:
        //minimum rotationer = (6 - 1) * (2 % 6) + (2 * 6) = 5 * 2 + 2 * 2 = 14
    }
}
