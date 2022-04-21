package com.company;

public class Code1_8 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i = 3; i <= 10; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }
}
