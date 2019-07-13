package com.usecases;

public class ArraySort {
    public int[]  reversString(int[] array){
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    System.out.println("i value::: "+ i);
                    swapped = true;
                }
            }
        }
        return array;
    }

    public static void main(String[]args){
        System.out.println("Hel444lpw");
        int[]  mya= {3,1,6,2,5};
        int[] nn=new ArraySort().reversString(mya);
        System.out.println();
    }
}
