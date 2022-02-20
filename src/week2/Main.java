package week2;

public class Main {
    public static void main(String[] args) {
        String number = "1e7";
        System.out.println(number + " is a number. This statement is " + isNumber(number) + ".");
    }

    public static boolean isNumber(String str){
        try{
            double number = Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }


    public static String isNUmberString(){


        return "";
    }
}
