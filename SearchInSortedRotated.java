package com.example;

public class SearchInSortedRotated {

    public static void main(String[] args) {
        int arr[] = {16, 19, 21, 25, 3, 5, 8, 10};
        int index = approach1(arr, 0, arr.length - 1, 16);
        System.out.println("Index is: " + index);
    }

    private static int approach1(int[] arr, int start, int end, int number) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == number) {
                return mid;
            }

            if (arr[mid] <= arr[end]) {

                if (number > arr[mid] && number <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[start] <= number && number < arr[mid]) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }


        }
        return -1;
    }

}
