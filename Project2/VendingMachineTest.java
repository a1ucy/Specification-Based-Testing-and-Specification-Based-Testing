package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testvm {

    @Test
    public void testPurchaseCandyExactChange() {
        assertEquals("Item dispensed.", VendingMachine.dispenseItem(20, "candy"));
    }

    @Test
    public void testPurchaseCokeExactChange() {
        assertEquals("Item dispensed.", VendingMachine.dispenseItem(25, "coke"));
    }

    @Test
    public void testPurchaseCoffeeExactChange() {
        assertEquals("Item dispensed.", VendingMachine.dispenseItem(45, "coffee"));
    }

    @Test
    public void testPurchaseCandyExtraChange() {
        assertEquals("Item dispensed and change of 10 returned", VendingMachine.dispenseItem(30, "candy"));
    }

    @Test
    public void testPurchaseCokeExtraChange() {
        assertEquals("Item dispensed and change of 5 returned", VendingMachine.dispenseItem(30, "coke"));
    }

    @Test
    public void testPurchaseCoffeeExtraChange() {
        assertEquals("Item dispensed and change of 10 returned", VendingMachine.dispenseItem(55, "coffee"));
    }

    @Test
    public void testPurchaseCandyNotEnoughChange() {
        assertEquals("Item not dispensed, missing 5 cents. Cannot purchase item.", VendingMachine.dispenseItem(15, "candy"));
    }

    @Test
    public void testPurchaseCokeNotEnoughChange() {
        assertEquals("Item not dispensed, missing 2 cents. Can purchase candy.", VendingMachine.dispenseItem(23, "coke"));
    }

    @Test
    public void testPurchaseCoffeeNotEnoughChange() {
        assertEquals("Item not dispensed, missing 5 cents. Can purchase candy or coke.", VendingMachine.dispenseItem(40, "coffee"));
    }

    
    @Test
    public void testInvalidIntegerInput() {
        assertEquals("", VendingMachine.dispenseItem("a", "coke"));
    }

}
