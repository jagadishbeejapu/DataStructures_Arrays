package com.example;

public class FindMissingNum {

    public static void main(String[] args) {
        int[] arr={7,5,6,4,2,3,8};
      approach1(arr);
    }

    private static void approach1(int[] arr) {

        //sum of n numbers =(n*(n+1))/2
        int missingNumber = 0;
        int sum= 0;
        int n = arr.length+1;
        for(int i:arr){
            sum+=i;
        }
        int  formulaSum = ((n*(n+1))/2);
        missingNumber = formulaSum-sum;
        System.out.println(missingNumber);
    }


}
