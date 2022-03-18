package week3;

public class Main {

    private int counter = 0;
    private Reader reader = new Reader();
    private String text = reader.getFile();

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.read7());
        System.out.println(main.read7());
        System.out.println(main.read7());
    }


    //Metode som returnere de næste 7 karaktere i filen.
    private String read7(){
        String stringToReturn = "";
        for (int i = 0; i < 7; i++) {
            try {
                stringToReturn += text.charAt(counter);
                counter++;
            }
            catch (Exception e){
                break;
            }
        }
        return stringToReturn;
    }


    //metode som tager i mod en integer i parameter og returnere en String med det antal karaktere (maks)
    private String readN(int n){
        String stringToReturn = "";
        for (int i = 0; i < n; i++) {
            try {
                stringToReturn += text.charAt(counter);
                counter++;
            }
            catch (Exception e){
                break;
            }
        }
        return stringToReturn;
    }
}
