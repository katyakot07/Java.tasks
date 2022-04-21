package com.company;

public class Code1_3 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Hello world");
        {
            a.delete(0, 1);
            System.out.println(a);

        }
    }
}
