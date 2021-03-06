package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Stage2 {

    static Integer mostFrequentInt(List<Integer> list){
        if (list == null || list.size()==0){
            throw new IllegalArgumentException();
        }

        list.sort(null);
        //Collection.sort(list);

        Integer mostFrequentInt = null;
        Integer mostFrequentTotal = 0;
        Integer currentInt = null;
        Integer currentCount = 0;

        for (Integer i: list){
            if (i == currentInt){
                currentCount += 1;
            } else {
                currentInt = i;
                currentCount = 1;
            }
            if(mostFrequentTotal < currentCount){
                mostFrequentTotal = currentCount;
                mostFrequentInt = currentInt;
            }
        }
        return mostFrequentInt;
    }

    public static void main(String[] args) {
        List<Integer> la = new ArrayList<>();
        la.add(3);
        la.add(1);
        la.add(3);
        la.add(3);
        la.add(4);
        la.add(1);
        System.out.println("Most frequent integer in array 1a: " + mostFrequentInt(la));
        List<Integer> lb = new ArrayList<>();
        lb.add(0);
        System.out.println("Most frequent integer in array 1b: " + mostFrequentInt(lb));
    }
}
