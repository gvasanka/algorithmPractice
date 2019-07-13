package com.asanka.usecases;

public class FindSum {
    public String  findValue(int[] aa, int sum){
        int v,xc;
        for( v=0;v< aa.length;v++){
            int val=sum-aa[v];

            for(xc=0;xc< aa.length;xc++){
                if(v!=xc){
                    if(val==aa[xc]){
                        System.out.println(aa[v]+"A   "+aa[xc]);
                        return "Found Match";
                    }
                }

            }
        }
        return "No match";
    }

    public static void main(String[]args){
        System.out.println("Hellpw");
        int [] xx={1,42,23,3,5,6};
        String nn=new FindSum().findValue(xx,5);
        System.out.println(nn);
    }
}
