package com.ds;

public class Main {
    public int findLargestNumber(int [] arr){
        int largest=arr[0];

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
               largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println("Hellpw");
        int []q ={1,2,4,44,5};
        int largest=new Main().findLargestNumber(q);
        System.out.println(largest);
    }
}

