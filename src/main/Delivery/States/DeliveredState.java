package main.Delivery.States;

import main.DeliveryContext;

public class DeliveredState implements PackageState {
    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is delivered.");
    }
}
