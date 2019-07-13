package com.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateLettersOnString {
    public Map<Character ,Integer> findDuplicate(String abc){
        char[] text=abc.toCharArray();
        Map<Character ,Integer> abd= new HashMap<Character,Integer>();
        for(Character key:text){
            if(abd.containsKey(key)){
                abd.put(key,abd.get(key)+1);
            }else {
                abd.put(key,1);
            }

        }
        return abd;
    }

    public static void main(String[]args){
        System.out.println("Hellpw");
        String hello= "SomeText";
        Map<Character,Integer> jj= new FindDuplicateLettersOnString().findDuplicate(hello);
        Set<Character> lanka=jj.keySet();
        for(Character key: lanka){
            if(jj.get(key)>1){
                System.out.println(key+" is duplicated  ::"+jj.get(key)+" times");
            }

        }

    }
}
