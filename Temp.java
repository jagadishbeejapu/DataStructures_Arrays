package com.example;

// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
public class Temp
{

    public static void main(String[] args) {
        int arr[] = {16, 19, 21, 25, 3, 5, 8, 10};
        int index = approach1(arr, 0, arr.length - 1, 5);
        System.out.println("Index is: " + index);
    }

    private static int approach1(int[] arr, int start, int end, int number) {

      while(start<end){
       int mid = start + (end-start)/2;
       if(arr[mid]>arr[end]){
           start = mid+1;
       }
       else{
           end = mid;
       }

      }
        return arr[start];
    }
}
