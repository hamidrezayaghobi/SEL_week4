package main.Delivery.States;

import main.Delivery.DeliveryContext;

public interface PackageState {
    void updateState(DeliveryContext ctx);
}
