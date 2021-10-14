package com.example.singletonpattern.service;

import org.springframework.stereotype.Component;

@Component
public final class Singleton {
    private static Singleton singleton;

    private Singleton(){
    }

    /**
     * synchronized 和 Lock
     * @return
     */
    public synchronized static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}