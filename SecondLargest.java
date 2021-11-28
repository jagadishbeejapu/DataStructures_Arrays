package com.example;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr={7,5,6,1,4,2};
       approach1(arr);

    }



    private static void approach1(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest= largest;
                largest= arr[i];

            }
            else if(arr[i] >secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);


    }
}
