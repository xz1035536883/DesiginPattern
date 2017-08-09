package com.example.simpleFactory;

/**
 * @Author ryan.xu
 * @since 2017/8/8
 */
public class OperationDiv implements Operation {
    @Override
    public String getResult(double numberA, double numberB) {
        if (numberB != 0) {
            return String.valueOf(numberA / numberB);
        } else {
            return "被除数不能为零";
        }
    }
}
