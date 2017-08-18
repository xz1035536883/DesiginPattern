package com.example.decorator;

/**
 * @Author ryan.xu
 * @since 2017/8/16
 */
public class ConcreteDecoratorB extends Decorator {
    protected Component component;
    public ConcreteDecoratorB(){

    }
    public ConcreteDecoratorB(Component component){
        this.component=component;
    }
}
