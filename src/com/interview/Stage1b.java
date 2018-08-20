package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Stage1b {

    static Integer mostFrequentInt(List<Integer> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException();
        }
        Integer mostFrequentInt = null;
        Integer mostFrequentTotal = 0;
        HashMap<Integer, Integer> totals = new HashMap<>();

        for (Integer i : list) {
            Integer val;
            if (totals.containsKey(i)) {
                val = totals.get(i) + 1;
            } else {
                val = 1;
            }
            totals.put(i, val);
            if (mostFrequentTotal < val) {
                mostFrequentTotal = val;
                mostFrequentInt = i;
            }
        }
        return mostFrequentInt;
    }

    public static void main(String[] args) {
        List<Integer> la = new ArrayList<>();
        la.add(3);
        la.add(1);
        la.add(3);
        la.add(4);
        la.add(1);
        System.out.println("Most frequent integer in array 1a: " + mostFrequentInt(la));
        List<Integer> lb = new ArrayList<>();
        lb.add(0);
        System.out.println("Most frequent integer in array 1b: " + mostFrequentInt(lb));
        List<Integer> lc = new ArrayList<>();
        System.out.println("Most frequent integer in array 1c: " + mostFrequentInt(lc));
    }
}

