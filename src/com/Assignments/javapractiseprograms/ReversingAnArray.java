package com.Assignments.javapractiseprograms;

import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        int i,j;
        char temp;
        char[] arr={'a','b','c','d','e'};
        i=0;
        j=arr.length-1;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }

            System.out.println(Arrays.toString(arr));
        }
    }

