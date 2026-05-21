import java.util.Scanner;

class SmartFan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int speed;

        System.out.print("Enter Fan Speed (0-5): ");
        speed = sc.nextInt();

        if(speed == 0) {
            System.out.println("Fan is OFF");
        }
        else if(speed >= 1 && speed <= 5) {
            System.out.println("Fan Speed is set to " + speed);
        }
        else {
            System.out.println("Invalid Speed");
        }
    }
}