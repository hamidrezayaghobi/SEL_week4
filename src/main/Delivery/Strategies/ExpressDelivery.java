package main.Delivery.Strategies;

public class ExpressDelivery implements DeliveryStrategy {
    @Override
    public double calculatePrice(double weight) {
        return weight * 3.5;
    }
}