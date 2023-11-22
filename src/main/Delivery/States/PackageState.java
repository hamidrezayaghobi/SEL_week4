package main.Delivery.States;

import main.DeliveryContext;

public interface PackageState {
    void updateState(DeliveryContext ctx);
}
