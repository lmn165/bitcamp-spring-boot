package com.example.demo.util.service;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaUtils {
    public static Consumer<String> print = System.out::print;
//    public static Consumer<String> print = s -> System.out.print(s);
    public static Function<Object, String> string = String::valueOf;
//    public static Function<Object, String> string = o -> String.valueOf(o);
    public static Function<String, Integer> strToInt = Integer::parseInt;
//    public static Function<String, Integer> strToInt = s -> Integer.parseInt(s);
}
