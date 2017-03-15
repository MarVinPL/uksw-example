import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {

        String liczba = "2+5*3";


        System.out.println("");
        System.out.println("");

        String filePath = "src/test.txt";

                FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String textLine = bufferedReader.readLine();
        do {
            System.out.println(textLine);

            textLine = bufferedReader.readLine();
        } while (textLine != null);

        bufferedReader.close();



    }
}