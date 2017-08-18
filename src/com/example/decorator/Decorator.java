package com.example.decorator;

/**
 * @Author ryan.xu
 * @since 2017/8/16
 */
public class Decorator implements Component {
    protected Component component;

    public Decorator() {
    }
    public Decorator(Component component){
        this.component=component;
    }
    @Override
    public void operation() {
        if(component!=null){
            component.operation();
        }
    }
}
