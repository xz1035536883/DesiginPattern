package com.example.decorator;

/**
 * @Author ryan.xu
 * @since 2017/8/16
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(){

    }
    public ConcreteDecoratorA(Component component){
        this.component=component;
    }

    @Override
    public void operation() {
        System.out.println("DecoratorA invoked");
        super.operation();
    }
}
