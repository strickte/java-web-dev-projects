package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ComputerTests {
    Computer test_computer;

    @BeforeEach
    public void createComputerObject() {
        test_computer = new Computer("Apple");
    }

    @Test
    public void testGoesBeepBoop() {
        assertFalse(test_computer.isGoesBeepBoop());
    }
    @Test
    public void testMakeNoiseTrue() {
        test_computer.makeComputations();
        assertEquals("Beep-boop", test_computer.makeNoise());
    }
    @Test
    public void testMakeNoiseFalse() {
        assertEquals("....", test_computer.makeNoise());
    }

}
