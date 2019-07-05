package com.zsl.mavengit.test;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");

        // 不推荐的方式
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

        // 推荐的Optional函数编程风格
        optional.ifPresent(item -> System.out.println(item));
        System.out.println("-------------------");

        // optional容器为空，则打印后面的传入的值，类似三目运算符
        System.out.println(optional.orElse("world"));
        System.out.println("-------------------");

        System.out.println(optional.orElseGet(() -> "nihao"));


    }


}
