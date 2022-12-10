package AdvancedJava;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetSamples {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Oleg");
        hashSet.add("Irina");
        hashSet.add("Sviatoslav");
        hashSet.add("Arsenii");
        hashSet.add("Leonid");

        System.out.println(hashSet);
    }
}
