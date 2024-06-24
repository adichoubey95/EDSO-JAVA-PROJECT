package com.array;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] z;    // array declaration// one dimensional array //integer array of z.// recomended
        z = new int[5]; // array Initialization
        z[0] = 5;
        z[1] = 10;
        z[2] = 15;
        z[3] = 20;
        z[4] = 25;
        //  System.out.println(z);  //address of the array will print
        //   System.out.println(z[0]); value of zero index will print

        System.out.println(z.length);// to know the size of the array;

      /* for (int arrayValue : z) { // to print all the value of array ,for each loop will use.
           System.out.println(arrayValue);
       }*/
        for(int i=0;i<z.length;i++){
            System.out.println(z[i]);
        }
    }

}

    /*int[]y;
    int s[];
    int h [];*/