package com.asanka.usecases;


public class FindPrimeNumberFromArray {

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1) return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public void findPrimeNumber(int[] array){
       for(int i=0; i<array.length;i++){
            int val=array[i];
            for(int j=2; j<val; j++){
                int remi=val % j;
                if(remi!=0){
                    System.out.println("Fund Prime No: "+val);
                }
            }
       }
    }

    public static void main(String[]args){
        System.out.println("Hel444lpw");
        int[]  mya= {1,2,3,4,5};
//        new FindPrimeNumberFromArray().findPrimeNumber(mya);
        System.out.println();

        for(int value:mya){
           if(isPrime(value))
               System.out.println(value);
        }
    }
}
