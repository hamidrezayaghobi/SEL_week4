package main.Delivery.States;

import main.Delivery.DeliveryContext;

public class InTransitState implements PackageState {
    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is in-transit.");
    }
}
