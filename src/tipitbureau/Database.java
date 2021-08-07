package tipitbureau;
import java.util.Scanner;

public class Database {

    static int kansascity = 5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your city: ");
        String usercity = scanner.nextLine();



        if(usercity.equals("Kansas City")) {
            System.out.println("This is the average gratuity" +
                    " for your city: $" + kansascity);
        }
        else {
                System.out.println("There is no data for this city.");
            }






    }


}