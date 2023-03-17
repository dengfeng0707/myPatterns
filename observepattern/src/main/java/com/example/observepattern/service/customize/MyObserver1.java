package com.example.observepattern.service.customize;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者实现
 */
public class MyObserver1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (null != arg) {
            String param = arg.toString();
            System.out.println(String.format("MyObserver1 --> update, arg:%s", param));
        }
    }
}