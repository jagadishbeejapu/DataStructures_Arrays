package com.example;

public class MinInSortedRotated {
    public static void main(String[] args) {
        int arr[]={15,19,21,25,2,5,8,10};

       int minVal= approach1(arr,0,arr.length-1);
        System.out.println("Smallest is: "+ minVal);
    }

    private static int approach1(int[] arr, int start ,int end) {

        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
            return arr[start];

        }
    }

