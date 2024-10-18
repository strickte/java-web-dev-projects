package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    
    @Test
        public void textStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
        public void balancedBracketWithTextInMiddle() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void bracketsInsideAWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("La[unch]Code"));
    }
    @Test
        public void bracketsBeforeTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));

    }
    @Test
        public void bracketsBeforeAndAfterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }

    @Test
        public void doubleBracketWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }
    //Unbalanced Tests
    @Test
        public void reversedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
        public void oneBracketAtStartOfStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
        public void reverseOrderBracketInsideReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Laun]chCode["));
    }
    @Test
        public void singleOpeningBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
        public void oneFullAndOneHalfBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode[]"));
    }
}