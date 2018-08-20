package com.interview;

import java.util.ArrayList;
import java.util.List;

public class Stage0c {

    static Integer mostFrequentInt(List<Integer> list) {
        Integer mostFrequentInt = null;
        if (list == null || list.size() == 0) {
            return 0;
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
        System.out.println("Most frequent integer in array 1a: " + mostFrequentInt(lb));
        List<Integer> lc = new ArrayList<>();
        System.out.println(mostFrequentInt(lc));
    }
}

