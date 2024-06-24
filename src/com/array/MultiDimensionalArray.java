package com.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
       // int [][]i; // two dimensional array declaration
        /*i=new int[3][3]; //definition of array.
        i[0][0]=10;
        i[0][1]=20;
        i[0][2]=30;
        i[1][0]=40;
        i[1][1]=50;
        i[1][2]=60;
        i[2][0]=70;
        i[2][1]=80;
        i[2][2]=90;*/


        int [][]i={{10,20,30}, {40,50,60},{70,80,90}}; //optimized way of defining the array.

        for(int z=0;z<i.length;z++) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(i[z][j] + " ");
            }
            System.out.println();
        }
    }
}
/*       int[][]b;
        int c[][];
        int[]e[];*/
//int f[]g[]; two variable is not possible
