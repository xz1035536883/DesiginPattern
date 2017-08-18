package com.example.strategy;

/**
 * @Author ryan.xu
 * @since 2017/8/16
 */
public class StrategyA implements Strategy{
    @Override
    public void algorithm() {
        System.out.println("This is Strategy");
    }
}
