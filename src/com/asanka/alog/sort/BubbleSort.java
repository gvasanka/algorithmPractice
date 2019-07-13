package com.asanka.alog.sort;

public class BubbleSort {

    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int j;
        for (int i = 0; i < n; i++) {
            for ( j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] optimizedBubbleSort(int[] arr){
        int n= arr.length;
        boolean swapped=false;

        for(int i=0;i<n;i++){
            for(int j=0; j<n-1;j++){
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                return arr;
            }
        }
        return arr;
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
        arr=new BubbleSort().bubbleSort(arr);
        new BubbleSort().printArray(arr);

        int arr1[] = {22, 22, 22, 22, 22, 22, 22};
        arr=new BubbleSort().optimizedBubbleSort(arr1);
        new BubbleSort().printArray(arr);
    }
}
