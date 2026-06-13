import java.util.Scanner;

class Device {
    public String name;
    public boolean status;

    Device(String name) {
        this.name = name;
        this.status = false;
    }

    void turnOn() {
        status = true;
        System.out.println(name + " is ON");
    }

    void turnOff() {
        status = false;
        System.out.println(name + " is OFF");
    }

    void showStatus() {
        System.out.println(name + " Status: " + (status ? "ON" : "OFF"));
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Device light = new Device("Light");
        Device fan = new Device("Fan");
        Device ac = new Device("Air Conditioner");

        int choice;

        do {
            System.out.println("\n===== Smart Home Automation =====");
            System.out.println("1. Turn ON Light");
            System.out.println("2. Turn OFF Light");
            System.out.println("3. Turn ON Fan");
            System.out.println("4. Turn OFF Fan");
            System.out.println("5. Turn ON AC");
            System.out.println("6. Turn OFF AC");
            System.out.println("7. Show Device Status");
            System.out.println("8. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    light.turnOn();
                    break;
                case 2:
                    light.turnOff();
                    break;
                case 3:
                    fan.turnOn();
                    break;
                case 4:
                    fan.turnOff();
                    break;
                case 5:
                    ac.turnOn();
                    break;
                case 6:
                    ac.turnOff();
                    break;
                case 7:
                    light.showStatus();
                    fan.showStatus();
                    ac.showStatus();
                    break;
                case 8:
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8);
    }
}
