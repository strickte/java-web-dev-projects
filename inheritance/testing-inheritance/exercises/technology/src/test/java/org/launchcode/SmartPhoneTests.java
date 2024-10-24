package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartPhoneTests {
    SmartPhone test_smartPhone;

    @BeforeEach
    public void createSmartPhoneObject() {
        test_smartPhone = new SmartPhone(true, "Apple");
    }

    @Test
    public void testSwitchOnSilentToFalse() {
        test_smartPhone.switchSilentMode();
        assertFalse(test_smartPhone.isGetOnSilent());
    }
    @Test
    public void testBrand() {
        assertEquals("Apple", test_smartPhone.getBrand());
    }
    @Test
    public void testHasScreen() {
        assertTrue(test_smartPhone.isHasScreen());
    }
}
