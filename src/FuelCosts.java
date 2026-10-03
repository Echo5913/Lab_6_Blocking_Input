import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;

        String trash;
        boolean done;

        do {
            done = false;

            System.out.print("Enter the number of gallons in the tank: ");

            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();

                done = true;
            } else {
                trash = in.nextLine();

                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number.");
            }

        } while (!done);

        do {
            done = false;

            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                in.nextLine();

                done = true;
            } else {
                trash = in.nextLine();

                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number.");
            }

        } while (!done);

        do {
            done = false;

            System.out.print("Enter the price of gas per gallon: ");

            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();

                done = true;
            } else {
                trash = in.nextLine();

                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number.");
            }

        } while (!done);

        double costFor100Miles = (100 / milesPerGallon) * pricePerGallon;
        double distanceOnFullTank = gallons * milesPerGallon;

        System.out.println("Cost to drive 100 miles: $" + costFor100Miles);
        System.out.println("Distance with a full tank: " + distanceOnFullTank + " miles");
    }
}