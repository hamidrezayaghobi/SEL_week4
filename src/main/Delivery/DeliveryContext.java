package main.Delivery;

import main.Delivery.States.PackageState;
import main.Delivery.Strategies.DeliveryStrategy;

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
