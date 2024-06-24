package com.Assignments;

public class ArmstrongNo {
    public static void main(String[] args) {
        int i=1,a,b,c;
        while(i<=500) //153
        {
            a=i%10; //3
            b=i%100;//53
            b=(b-a)/10;//5
            c=i/100;//1

            if((a*a*a)+(b*b*b)+(c*c*c)==i)
                System.out.println(i);
                i++;
        }

    }
}
