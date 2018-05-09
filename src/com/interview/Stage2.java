package com.interview;

import java.util.ArrayList;
import java.util.List;

public class Stage2 {

    static Integer mostFrequentInt(List<Integer> l){
        if (l == null || l.size()==0){
            throw new IllegalArgumentException();  //don't forget throw dont add return and throw
        }

        Integer mostFrequentInt = null;
        Integer mostFrequentCount = 0;
        Integer currentInt = null;
        Integer currentCount = 0;

        for (Integer i: l){
            if (i == currentInt){
                currentCount += 1;
            } else {
                if(mostFrequentCount<currentCount){
                    mostFrequentCount = currentCount;
                    mostFrequentInt = currentInt;
                }
                currentInt = i;
                currentCount = 1;
            }
        }
        return mostFrequentInt;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(3);
        l.add(4);
        l.add(4);
        l.add(4);
        l.add(5);
        System.out.println(mostFrequentInt(l));
    }
}
