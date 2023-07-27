package com.yangnk.UniqID.yangnkMall.myTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyTest {

    public static void main(String[] args) {
        try {
            throw new MyException("出错了");
        } catch (MyException e) {
//            e.printStackTrace();
            log.error("e:{}", e);

        }
    }
}
