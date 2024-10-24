package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaptopTests {
    Laptop test_laptop;

    @BeforeEach
    public void createLaptopObject() {
        test_laptop = new Laptop("Sara", "Apple");
    }

    @Test
    public void testUserName() {
        assertEquals("Sara", test_laptop.getUserName());
    }
    @Test
    public void testBrand() {
        assertEquals("Apple", test_laptop.getBrand());
    }
    @Test
    public void testHasKeyboard() {
        assertEquals(true, test_laptop.isHasKeyboard());
    }
}
