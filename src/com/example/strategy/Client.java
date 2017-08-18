package com.example.strategy;

/**
 * @Author ryan.xu
 * @since 2017/8/16
 */
public class Client {
    public static void main(String[] args){
        Content content1 = new Content(new StrategyA());
        content1.contentInterface();
        Content content2 = new Content(new StrategyB());
        content2.contentInterface();
    }
}
