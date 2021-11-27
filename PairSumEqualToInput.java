package com.example;

public class PairSumEqualToInput {

    public static void main(String[] args) {
        int[] arr = {1,30,-5,70,-8,20,-40,60};
//approach1(arr,65);
       approach2(arr,65);

    }

    private static void approach2(int[] arr, int sum) {
        

    }

    private static void approach1(int[] arr,int sum) {
        int firstElement=0 ;
        int secondElement =0;
        for (int i =0;i<arr.length;i++){
                for(int j =i+1;j<arr.length;j++){
                    int tempSum = arr[i]+arr[j];
                    if(Math.abs(sum)== Math.abs(tempSum)){
                        firstElement = arr[i];
                        secondElement = arr[j];
                    }
                }
            }
        System.out.println("Elements are "+ firstElement + " && "+ secondElement);
    }




}
