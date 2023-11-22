package main;

public class DeliveryContext {
    private DeliveryStrategy strategy;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double weight) {
        return strategy.calculatePrice(weight);
    }
}
