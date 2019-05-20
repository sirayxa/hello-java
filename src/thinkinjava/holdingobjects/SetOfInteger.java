package thinkinjava.holdingobjects;

import thinkinjava.PrintUtils;

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(rand.nextInt(30));
        }
        PrintUtils.println(hashSet);

        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            sortedSet.add(rand.nextInt(30));
        }
        PrintUtils.println(sortedSet);

        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER); // 按照字母排序


    }
}
