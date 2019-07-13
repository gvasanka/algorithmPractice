package com.ds;

import java.util.*;

public class sortAndJoinTwoArrays {
    public Object[] sortAndJoin(int[] abc, int[] cde){
        List<Integer> oo =new LinkedList<>();

        for (Integer aa:abc){
            oo.add(aa);
        }
        for (Integer bb:cde){
            oo.add(bb);
        }
        Object[]result =oo.toArray();
        return result;
    }


    public static void main(String[]args){
        System.out.println("Hello Asanka");

        int [] abc= {2,3,1,4};
        int [] cde= {1,5,3,6};

        Object[] kk=new sortAndJoinTwoArrays().sortAndJoin(abc,cde);
        Arrays.sort(kk);
        System.out.println(Arrays.toString(kk));
    }
}
