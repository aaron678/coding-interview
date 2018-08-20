package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Stage0 {

    static Integer mostFrequentInt(List<Integer> list) {

        return null;
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

