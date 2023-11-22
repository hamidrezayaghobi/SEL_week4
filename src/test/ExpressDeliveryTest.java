package test;

import main.DeliveryStrategy;
import main.ExpressDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressDeliveryTest {
    @Test
    public void testExpressDelivery() {
        DeliveryStrategy strategy = new ExpressDelivery();
        assertEquals(35.0, strategy.calculatePrice(10), 0.01);
    }
}
