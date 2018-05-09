package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Stage1 {

   static Integer mostFrequentInt(List<Integer> l){
       if (l == null || l.size()==0){
           throw new IllegalArgumentException();  //don't forget throw dont add return and throw
       }

Integer mostFrequentInt = null;
Integer mostFrequentValue = 0;
HashMap<Integer,Integer> totals = new HashMap<>();

for (Integer i: l){
    if (totals.containsKey(i)){
       Integer val = totals.get(i)+1;
        totals.put(i, val);
        if(mostFrequentValue<val){
            mostFrequentValue = val;
            mostFrequentInt = i;
        }
    } else {
        totals.put(i,1);
    }
}

        return mostFrequentInt;
    }

        public static void main(String[] args) {
           List<Integer> l = new ArrayList<>();
           l.add(3);
            l.add(1);
            l.add(3);
            l.add(4);
            l.add(1);
           System.out.println(mostFrequentInt(l));
        }
   }

