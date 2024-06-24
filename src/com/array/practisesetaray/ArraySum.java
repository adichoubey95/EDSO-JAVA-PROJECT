package com.array.practisesetaray;


//calculate the sum of floating array of 5num
public class ArraySum {
    //public static void main(String[] args) {
      /*  float [] array={10.20f,50.53f,58.48f,87.25f,85.20f};
        float sum=0;
        for(float element:array){
            sum=sum+element;
        }
        System.out.println(sum);
    }*/


        //givenn integer is present or not in array

    public static void main(String[] args) {
        float [] marks={10.20f,50.53f,58.48f,87.25f,85.20f};
        float num=10.20f;
        boolean isInArray=false;
        for (float element:marks){
          if (num==element){
              isInArray=true;
              break;
          }}
          if(isInArray){
              System.out.println("the element present in the array ");
          }else {
              System.out.println("the element not present in the array");
          }


        }
    }







