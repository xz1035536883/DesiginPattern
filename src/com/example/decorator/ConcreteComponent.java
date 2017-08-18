package com.example.decorator;

/**
 * @Author ryan.xu
 * @since 2017/8/16
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Conctete Component");
    }
}
