package calculator.operators;

import java.util.HashMap;
import java.util.Map;

import calculator.operands.Operand;

public abstract class Operator {
    public static Map<String, Operator> validOperators;
    static {
        validOperators = new HashMap<>();

        validOperators.put("+", new Add());
        validOperators.put("-", new Subtract());
        validOperators.put("*", new Multiply());
        validOperators.put("/", new Divide());
    }

    public abstract int getPrecedence();
    public abstract Operand execute(Operand operandOne, Operand operandTwo);
}
