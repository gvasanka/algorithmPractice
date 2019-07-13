package com.usecases;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public String  reversString(String aa){
//        System.out.println(aa);
        char[] charArry= aa.toCharArray();
        char[] reve= new char[charArry.length];
        List<Character> kk=new ArrayList<Character>();
        for(int i=charArry.length-1;i>=0; i--){
//            System.out.println(charArry[i]);
            kk.add(charArry[i]);
            reve[i]=charArry[i];
        }
        System.out.println(reve[2]);
        return kk.toString() ;
    }

    public static void main(String[]args){
        System.out.println("Hel444lpw");
        String textValue="abcd";
        String nn=new ReverseString().reversString(textValue);
        System.out.println(nn);
    }
}
