package com.example.decorator;

/**
 * @Author ryan.xu
 * @since 2017/8/16
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA da = new ConcreteDecoratorA(c);
        ConcreteDecoratorB db = new ConcreteDecoratorB(da);
        db.operation();
    }
}
