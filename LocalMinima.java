package com.example;

public class LocalMinima {
    public int findLocalMinima(int [] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        int size = arr.length;
        System.out.println("mid is "+ mid);
        /*check the local minima
         *first check if left and right neighbor exists */
        if ((mid == 0 || arr[mid - 1] > arr[mid]) &&
                (mid == size - 1 || arr[mid + 1] > arr[mid])) {
            System.out.println("in if");
            return arr[mid];
        }  /* check if left neighbor is less than mid element, if yes go left */
        else if (mid > 0 && arr[mid] > arr[mid - 1]) {
            System.out.println("in else");
            return findLocalMinima(arr, start, mid);
        } else {
            /*check if right neighbor is greater than mid element, if yes go right */
            return findLocalMinima(arr, mid + 1, end);
        }

    }
    public static void main(String[] args) {
        LocalMinima l = new LocalMinima();
        int[] arr = {10, 5, 3, 6, 13, 16, 7};
        System.out.println("Local Minima is: " + l.findLocalMinima(arr, 0, arr.length));
    }
}
