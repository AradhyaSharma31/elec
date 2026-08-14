package com.elec.elec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElecApplicationTests {

    @Test
    void testZeroUnits() {
        assertEquals(0.0,
                ElecApplication.calculateBill(0));
    }

    @Test
    void testUnitsWithinFirstSlab() {
        assertEquals(75.0,
                ElecApplication.calculateBill(50));
    }

    @Test
    void testExactly100Units() {
        assertEquals(150.0,
                ElecApplication.calculateBill(100));
    }

    @Test
    void testUnitsWithinSecondSlab() {
        assertEquals(250.0,
                ElecApplication.calculateBill(140));
    }

    @Test
    void testExactly200Units() {
        assertEquals(400.0,
                ElecApplication.calculateBill(200));
    }

    @Test
    void testUnitsWithinThirdSlab() {
        assertEquals(1000.0,
                ElecApplication.calculateBill(350));
    }

    @Test
    void testExactly500Units() {
        assertEquals(1600.0,
                ElecApplication.calculateBill(500));
    }

    @Test
    void testUnitsAbove500() {
        assertEquals(1900.0,
                ElecApplication.calculateBill(550));
    }

    @Test
    void testNegativeUnits() {
        assertThrows(
                IllegalArgumentException.class,
                () -> ElecApplication.calculateBill(-10)
        );
    }

}
