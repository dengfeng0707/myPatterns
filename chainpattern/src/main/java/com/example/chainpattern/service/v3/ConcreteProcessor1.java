package com.example.chainpattern.service.v3;

public class ConcreteProcessor1 extends Processor {

    @Override
    public Integer process(Integer input) {
        // 可以处理,返回结果
        if (input.equals(1)) return 1;

        if (null != super.successor) {
            return super.successor.process(input);
        }
        return -1;
    }
}
