package com.Assignments.javapractiseprograms;

public class LargestNoInArray {
    public static void main(String[] args) {
        int []a={4,8,9,7,10};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }

        }
        System.out.println(max);
    }
}
