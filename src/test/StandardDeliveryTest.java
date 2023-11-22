package test;

import main.DeliveryStrategy;
import main.StandardDelivery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardDeliveryTest {
    @Test
    public void testStandardDelivery() {
        DeliveryStrategy strategy = new StandardDelivery();
        assertEquals(25.0, strategy.calculatePrice(10), 0.01);
    }
}
