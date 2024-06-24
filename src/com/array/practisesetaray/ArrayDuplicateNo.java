package com.array.practisesetaray;

public class ArrayDuplicateNo {
    public static void main(String[] args) {
        int [] a=new int[]{10,20,30,20,40,10};
        for(int i=0;i<a.length; i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println((a[j]));
                }

            }

        }
    }

}
