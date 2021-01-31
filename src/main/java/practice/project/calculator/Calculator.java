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

    /**
     *
     * @param num1
     * @param num2
     * @return
     * @throws ArithmeticException Keep in mind that ArithmeticException is an unchecked exception.
     * And the proper way to deal with unchecked exceptions is by just using if statements to validate
     * your variables before using them. Here I am treating it as if it were a checked exception for practice purposes
     */
    public int divide(int num1, int num2) throws ArithmeticException {
        LOGGER.info("Dividing '{}' by '{}'", num1, num2);
        return num1/num2;
    }

}
