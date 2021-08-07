package tipitbureau;
import java.util.Scanner;

public class Review {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the address of recent delivery: ");
        String newaddress = scanner.nextLine();

        System.out.println("Please enter the tip received ($): ");
        int tipreceived = scanner.nextInt();

        System.out.println("Thank you for your input!");
        System.out.println(newaddress + "," + " with a $" + tipreceived + " tip");
        System.out.println("This information will be added to our" +
                " database to be used by future delivery drivers.");

    }


}