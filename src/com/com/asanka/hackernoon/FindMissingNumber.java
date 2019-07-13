package com.com.asanka.hackernoon;

public class FindMissingNumber {

    private void findMissingNumber(int[] arr) {
        int arrLength=arr.length;
        int sum=(arrLength+1)*(arrLength+2)/2;
        System.out.println(sum);
        for(int value:arr){
            sum=sum-value;
        }
        System.out.println("Missing Number:  "+ sum);
    }

    public static void main(String[]args){
        System.out.println("Hello on Main");
        int[] arr = {1, 2, 4, 5};
        new FindMissingNumber().findMissingNumber(arr);

    }
}
