package com.example;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class NumberOddTimes {
    public static void main(String[] args) {

        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        approach1(array);
    }

    private static void approach1(int[] array) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);

            }
            else{
                map.put(array[i],map.get(array[i])+1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()%2==1){
                System.out.println(  entry.getKey());
            }
        }
    }
}
