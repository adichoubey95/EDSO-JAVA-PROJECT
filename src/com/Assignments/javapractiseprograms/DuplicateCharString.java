package com.Assignments.javapractiseprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the text");
       String str= scanner.nextLine();
        char[] c=str.toCharArray();//converting string into array
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(Character ch:c){
            if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(Character ch: map.keySet()){
            if(map.get(ch)>1){
                System.out.print(ch+""+map.get(ch));
            }
        }




    }
}
