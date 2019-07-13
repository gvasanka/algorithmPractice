package com.alog;

public class InsertionSort {

    public void insertionSort(int[] arr) {

    }




    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[]args){
        System.out.println("Hel444lpw");
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
      new InsertionSort().insertionSort(arr);
        new InsertionSort().printArray(arr);

    }
}
