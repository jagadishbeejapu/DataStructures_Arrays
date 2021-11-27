package com.example;

import java.util.Arrays;

public class PairWithMinSum {

    public static void main(String[] args) {
int[] arr = {1,30,-5,70,-8,20,-40,60};
//approach1(arr);
approach2(arr);

    }

    private static void approach1(int arr[]){
        int minSum =arr[0]+arr[1];
        int element1= arr[0];
        int element2 =arr[1];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){

                int tempSum =arr[i]+arr[j];
                if(Math.abs(tempSum)<Math.abs(minSum)){
                    element1= arr[i];
                    element2= arr[j];
                    minSum = tempSum;
                }
            }

        }
        System.out.println("elements are: "+ element1 +"&&"+ element2);
    }

    private static void approach2(int arr[]){

        Arrays.sort(arr);
        int sum =0;
        int minimumSum =Integer.MAX_VALUE;
        int l =0;
        int r=arr.length-1;
        int minLeft= arr[l];
        int minRight= arr[arr.length-1];
      while (l<r){
          sum = arr[l]+arr[r];
          if(Math.abs(sum)<Math.abs(minimumSum)){
              minimumSum = sum;
              minLeft = arr[l];
              minRight =arr[r];
          }
          if(sum<0){
              l++;
          }
          else{
              r--;
          }

      }

        System.out.println("two elements are "+minLeft +" && "+ minRight );
    }
}
