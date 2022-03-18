package week3;

import java.io.File;
import java.util.Scanner;

public class Reader {

    //Metode som læser en fil og indsætter alt indhold i en String
    public String getFile(){
        File f = new File("src/week3/text.txt");
        String text = "";
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()){
                text += scanner.nextLine();
            }
        }
        catch (Exception e){
            System.out.println("Fail");
        }
        return text;
    }
}
