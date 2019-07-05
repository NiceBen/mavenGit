package com.zsl.mavengit.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//        System.out.println(list.stream().map(i -> i*2).reduce(0, Integer::sum));

        // 获取流的三种常用方式
        // 1.可变参数创建
        Stream stream1 = Stream.of("hello", "world", "hello world");

        // 2.数组创建
        String[] myArray = new String[]{"hello", "world", "hello world"};
        Stream stream2 = Stream.of(myArray);
        Stream stream3 = Arrays.stream(myArray);

        // 3.集合创建
        List<String> list = Arrays.asList(myArray);
        Stream stream4 = list.stream();
    }
}
