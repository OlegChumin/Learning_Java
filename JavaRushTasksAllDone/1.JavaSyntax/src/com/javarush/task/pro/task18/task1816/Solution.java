package com.javarush.task.pro.task18.task1816;

import java.util.stream.Stream;

/* 
Преобразование данных-2
*/

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Отладка", "кода", " — ", "это", "как", "охота. ", "Охота","на", "баги.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        return strings.map(String::toUpperCase);
    }
}
