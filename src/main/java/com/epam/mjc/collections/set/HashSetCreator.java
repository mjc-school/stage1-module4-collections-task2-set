package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer number : sourceList) {
            if (number % 2 == 0) {
                do {
                    set.add(number);
                    number /= 2;
                } while (number % 2 == 0);
                set.add(number);
            } else {
                set.add(number);
                set.add(2 * number);
            }
        }
        return set;
    }
}
