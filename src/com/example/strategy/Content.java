package com.example.strategy;

/**
 * @Author ryan.xu
 * @since 2017/8/16
 */
public class Content {
    private Strategy strategy;
    public Content(Strategy strategy){
        this.strategy = strategy;
    }
    public void contentInterface(){
        strategy.algorithm();
    }
}
