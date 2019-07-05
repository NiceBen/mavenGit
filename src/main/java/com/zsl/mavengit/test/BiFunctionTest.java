package com.zsl.mavengit.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {

    public static void main(String[] args) {

        BiFunctionTest test = new BiFunctionTest();

        System.out.println(test.compute3(2, 3, (value1, value2) -> value1 + value2));
        System.out.println(test.compute3(2, 3, (value1, value2) -> value1 - value2));
        System.out.println(test.compute3(2, 3, (value1, value2) -> value1 * value2));
        System.out.println(test.compute3(2, 3, (value1, value2) -> value1 / value2));

        System.out.println("----------------------------------");

        System.out.println(test.compute4(2, 3, (value1, value2) -> value1 * value2, value3 -> value3 * 2));


    }

    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }


    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }

}
