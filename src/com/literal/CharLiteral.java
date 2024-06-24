package com.literal;

public class CharLiteral {
    public static void main(String[] args) {
        char ch='c';
       /* char ch1=c; consider a varible
        char ch2="ab"; consider as string
        char ch3='ab'; invalid unclosed value , not a statement*/

        char ch4=97;
        char ch5=0Xface;
        char ch6=077777;
        char ch7=65535;
        //char ch8=65536; out of range
        char ch8='\u0061';// 97\16 coverting 97 into hexadecimal number then \u0061 will be consider as unicode



        char ch9='\n'; // new line escape character
        char ch10='\t';// tab escape character
        //char ch11='\m'; invalid ecape character
        System.out.println(ch8);
        System.out.println(ch5);
        System.out.println(ch6);





    }
}
