package com.javarush.task.task28.task2811;

import java.util.LinkedHashMap;

/* 
ReentrantReadWriteLock
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        ReadWriteMap<Integer, String> linkedSafeMap = new ReadWriteMap<>(new LinkedHashMap<>());
    }
}
