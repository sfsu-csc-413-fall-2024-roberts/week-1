package tests.calculator.operators;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import calculator.operands.Operand;
import calculator.operators.Add;

public class AddTest {
    
    @Test
    public void testExecute() {
        Add addOperator = new Add();

        assertEquals(50, addOperator.execute(
            new Operand("42"),
            new Operand("8")
        ).getValue());
    }

    @Test
    public void tetsGetPrecedence() {
        Add addOperator = new Add();

        assertEquals(1, addOperator.getPrecedence());
    }
}
