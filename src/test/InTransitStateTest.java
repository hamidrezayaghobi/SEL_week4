package test;

import main.DeliveryContext;
import main.Delivery.States.InTransitState;
import main.Delivery.States.PackageState;
import org.junit.jupiter.api.Test;

public class InTransitStateTest {
    @Test
    public void testInTransitState() {
        DeliveryContext context = new DeliveryContext();
        PackageState state = new InTransitState();
        context.setState(state);
    }

}
