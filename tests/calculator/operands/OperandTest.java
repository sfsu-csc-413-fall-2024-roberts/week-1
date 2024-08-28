package tests.calculator.operands;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import calculator.operands.Operand;

public class OperandTest {
    

    @Test
    public void testGetValue() {
        Operand operand = new Operand("42");

        assertEquals(42, operand.getValue());
    }
}
