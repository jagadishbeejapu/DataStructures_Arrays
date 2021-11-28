package com.example;

public class SeparateOddEven {
    public static void main(String[] args) {
        int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
        int sortedArray[] = approach1(arr);
        printArray(sortedArray);
    }

    private static void printArray(int[] sortedArray) {

        for (int i : sortedArray) {
            System.out.print(i + " ");
        }

    }

    private static int[] approach1(int[] arr) {


        int l = 0;
        int r = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            while (arr[l] % 2 == 0) {
                l++;
            }
            while (arr[r] % 2 == 1) {
                r--;
            }
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        return arr;

    }

}





