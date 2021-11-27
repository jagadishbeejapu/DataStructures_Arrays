package com.example;

public class Separate0sand1s {
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,1,1,0,1};
     //   separationLogic(arr);
        int j[]=separationLogic2(arr);
        for(int i : j){
            System.out.print(i);
        }

    }

    //first approach. Time complexity O(n)
    private static void separationLogic(int[] arr) {
        int count =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0)
                count++;
        }
        int length = arr.length;
         for(int i =0;i<count;i++){
             arr[i]=0;
         }
         for(int i =count;i<arr.length;i++){
             arr[i]=1;
         }
        for(int i : arr){
            System.out.print(i);
        }
    }


    private static int[] separationLogic2(int[] arr) {
        for(int i =0;i<arr.length;i++){
            int left =0;
            int right = arr.length-1;
            while(arr[left]==0){
                left++;
            }
            while (arr[right]==1){
                right--;
            }
            if(left<right){
                int temp =arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return  arr;
    }
}
