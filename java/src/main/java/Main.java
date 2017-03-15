import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int select;
        Scanner scanner = new Scanner(System.in);
        Split s = new Split();

        do {
            System.out.println("1 - Wprowadzaj ręcznia");
            System.out.println("2 - Zpliku algo.txt");
            System.out.println("4 - KONIEC");
            select = scanner.nextInt();
            String linia;

            switch (select) {
                case 1:
                    String liniaR;
                    do {

                        liniaR = scanner.nextLine();
                        if (!liniaR.toString().isEmpty())
                            System.out.println(liniaR + "=" + s.algo(liniaR));

                    } while (!liniaR.endsWith("end"));
                    //MENU
                    break;
                case 2:
                    String filePath = "algo.txt";

                    FileReader fileReader = new FileReader(filePath);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    while ((linia = bufferedReader.readLine()) != null) {
                        System.out.println(linia + "=" + s.algo(linia));
                    }
                    break;
            }

        } while (select != 4);
    }
}