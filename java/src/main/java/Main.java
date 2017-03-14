import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put example of your classes
        String Str; //=new String("testasdend");
        Scanner odczyt = new Scanner(System.in);
        //boolean retVal; //=false;


        do {

            Str = odczyt.nextLine();

            //retVal = Str.endsWith( "end" );

            //mam pobrac 3 ostatnie znaki
            System.out.println(Str); //wyświetlamy powitanie

            //System.out.println("Returned Value = " + retVal );

        } while (true != Str.endsWith("end"));
    }
}