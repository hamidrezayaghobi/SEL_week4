package main;

public class StandardDelivery implements DeliveryStrategy {
    @Override
    public double calculatePrice(double weight) {
        return weight * 2.5;
    }
}