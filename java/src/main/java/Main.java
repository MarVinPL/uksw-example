import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        int select;
        do {
            System.out.println("1 - Wprowadzaj ręcznia");
            System.out.println("2 - Zpliku algo.txt");
            System.out.println("4 - KONIEC");
            Scanner scanner = new Scanner(System.in);
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("1");
                    do {

                    } while (true != Str.endsWith("end"));
                    //MENU
                    break;
                case 2:
                    System.out.println("2");
                    //MENU
                    break;
            }

        } while (select != 4);

/*
        System.out.println("");
        System.out.println("");

        String filePath = "test.txt";

        Split s = new Split();

                FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linia = " ";
        while((linia = bufferedReader.readLine()) != null){
                System.out.println(linia+"="+s.algo(linia));
            }

        //s.algo();
*/

    }
}