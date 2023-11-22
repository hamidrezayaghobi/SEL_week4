package main;

public class InTransitState implements PackageState {
    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is in-transit.");
        // State transition logic if needed
    }
}
