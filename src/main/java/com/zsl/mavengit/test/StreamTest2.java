package com.zsl.mavengit.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {

    public static void main(String[] args) {

        // 1.可以通过 collection 系列集合提供的 stream() 或 parallelStream()
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        // 2.通过 Arrays 中的静态方法 stream() 获取数组流
        String[] strs = new String[10];
        Stream<String> stream2 = Arrays.stream(strs);

        // 3.通过 Stream 类中的静态方式 of()
        Stream<String> stream3 = Stream.of("aa", "bb", "cc");

        // 4.创建无限流
        // 迭代
        Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);
        stream4.limit(10).forEach(System.out::println);

        // 生成
        Stream.generate(() -> Math.random()).limit(5)
                .forEach(System.out::println);
    }
}
