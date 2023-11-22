package main;
import main.Delivery.DeliveryContext;
import main.Delivery.States.DeliveredState;
import main.Delivery.States.InTransitState;
import main.Delivery.Strategies.ExpressDelivery;
import main.Delivery.Strategies.StandardDelivery;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeliveryContext context = new DeliveryContext();

        System.out.print("Enter the weight of the package: ");
        double weight = scanner.nextDouble();

        context.setState(new InTransitState());
        context.setStrategy(new StandardDelivery()); // Default to standard delivery

        while (true) {
            System.out.print("Choose delivery method (1 for Standard, 2 for Express): ");
            int deliveryChoice = scanner.nextInt();
            if (deliveryChoice == 1) {
                context.setStrategy(new StandardDelivery());
            } else if (deliveryChoice == 2) {
                context.setStrategy(new ExpressDelivery());
            }

            double price = context.executeStrategy(weight);
            System.out.println("Current delivery price: " + price);

            System.out.print("Update package state (1 for In-Transit, 2 for Delivered): ");
            int stateChoice = scanner.nextInt();
            if (stateChoice == 1) {
                context.setState(new InTransitState());
            } else if (stateChoice == 2) {
                context.setState(new DeliveredState());
                break;
            }
            context.updateState();
        }

        scanner.close();
        double finalPrice = context.executeStrategy(weight);
        System.out.println("Program ended. Package delivered, you must pay: " + finalPrice);
    }
}
