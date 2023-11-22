package main;

import main.Delivery.States.PackageState;

public class DeliveryContext {
    private DeliveryStrategy strategy;
    private PackageState state;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double weight) {
        return strategy.calculatePrice(weight);
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void updateState() {
        state.updateState(this);
    }
}
