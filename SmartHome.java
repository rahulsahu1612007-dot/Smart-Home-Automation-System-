import java.util.Scanner;

public class SmartHome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Turn Light ON");
            System.out.println("2. Turn Light OFF");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Light is ON");
                    break;

                case 2:
                    System.out.println("Light is OFF");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 3);
    }
}
