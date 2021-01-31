package practice.project.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getPackage().getName());

    public Calculator() {}

    public int add(int num1, int num2) {
        LOGGER.info("Adding '{}' and '{}'", num1, num2);
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        LOGGER.info("Subtracting '{}' from '{}'", num2, num1);
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        LOGGER.info("multiplying '{}' by '{}'", num1, num2);
        return num1 * num2;
    }

    public int divide(int num1, int num2) throws ArithmeticException {
        LOGGER.info("Dividing '{}' by '{}'", num1, num2);
        return num1/num2;
    }

}
