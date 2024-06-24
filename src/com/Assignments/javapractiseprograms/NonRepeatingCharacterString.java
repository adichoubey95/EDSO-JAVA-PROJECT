package com.Assignments.javapractiseprograms;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacterString {
    public static void main(String[] args) {
        String str="abbccddeeffgg";
        Map<Character, Integer> hashMap=new HashMap<Character, Integer>();
        int lengthOfString=str.length();
        for(int i=0;i<lengthOfString;i++){
          Character currentCharacter=str.charAt(i);
          if(hashMap.containsKey(currentCharacter)==false){
              hashMap.put(currentCharacter,1);
          }else{
              int currentFrequency=hashMap.get(currentCharacter);
              currentFrequency++;
              hashMap.put(currentCharacter,currentFrequency);//updated frequency and character
          }
        }
        boolean noRepeatingFound=false;
        for(int i=0;i<lengthOfString;i++){
            Character currentCharacter=str.charAt(i);
            int currentFrequency=hashMap.get(currentCharacter);
            if(currentFrequency==1){
                System.out.println(currentCharacter);
            noRepeatingFound=true;
            break;}}
        if(noRepeatingFound==false){
            System.out.println(-1);
        }
    }
}
