package com.Assignments.javapractiseprograms;

public class SecondLargestNoArray {
    public static void main(String[] args) {
        int[] array={2,6,4,3,8,10};//10,8,6,4,3,2
        int temp;
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }

            }

        }
        System.out.println(array[1]);
    }
}
