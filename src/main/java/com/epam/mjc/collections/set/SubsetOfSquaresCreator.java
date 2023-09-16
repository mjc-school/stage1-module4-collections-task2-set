package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> set = new TreeSet<>();

        for (Integer number : sourceList) {
            number = number * number;
            if (number >= lowerBound && number <= upperBound) {
                set.add(number);
            }
        }
        return set;
    }
}
