package com.example.simpleFactory;

/**
 * @Author ryan.xu
 * @since 2017/8/8
 */
public class Client {
    public static void main(String[] args){
        String result= null;
        Operation operation = OperationFactory.createOperate("-");
        if(operation!=null){
            result = operation.getResult(2,3);
        }else {
            result="请输入正确的操作符";
        }
        System.out.println(result);
    }
}
