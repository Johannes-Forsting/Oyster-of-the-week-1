package week1;

import java.util.ArrayList;

public class MainWithArrayList {
    public static void main(String[] args) {
        //Her opretter jeg bare en arrayliste med samme tal som i opgavebeskrivelsen.
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            numbers.add(i);
        }

        //Talrækken printes
        System.out.println(numbers.toString());



        //Antallet af gange som der skal roteres er n, så kører jeg metoden og printer den nye talrække
        int n = 2;
        numbers = rotateByN(numbers, n);
        System.out.println(numbers.toString());




    }

    private static ArrayList<Integer> rotateByN(ArrayList<Integer> numbers, int n){

        //Antallet af rotates komprimeres ned til et tal som er mindre end længden af listen
        //Ved ikke om det er snyd i forhold til opgaven men det giver ikke mening at rotere listen mere end den er lang.
        int rotates = n % numbers.size();

        //Så kører jeg igennem et loop n antal gange som tilføjer det første tal i slutningen og fjerne derefter tallet i starten.
        for (int i = 0; i < rotates; i++) {
            numbers.add(numbers.get(0));
            numbers.remove(0);
        }
        return numbers;

        //Derved er minimum af rotationer = (n % (listens længde)) * 2
        //I tilfældet her med en liste på 6 elementer og rotation på 2:
        //Minimum rotationer = (2 % 6) * 2 = 2 * 2 = 4
    }


}
