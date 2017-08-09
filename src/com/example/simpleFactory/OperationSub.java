package com.example.simpleFactory;

/**
 * @Author ryan.xu
 * @since 2017/8/8
 */
public class OperationSub implements Operation {
    @Override
    public String getResult(double numberA, double numberB) {
        return String.valueOf(numberA - numberB);
    }
}
