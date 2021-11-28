package com.example;

public class FindSmallLargest {
    public static void main(String[] args) {
        int arr[] = new int[]{789, 12, 56, 76, 89, 876,2,2, 100, 21, 234, 343, 888, 125, 51, 1,417, 987};    //343 12
        approach1(arr);
    }


    private static void approach1(int[] arr) {

        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("largest is:  " + largest);
        System.out.println("smallest isL " + smallest);


    }


}
