package com.company;
import java.util.Arrays;

public class Code1_7 {
    public static void main(String[] args) {

        String str1 = "ток";
        String str2 = "кот";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        str1 = new String(ch1);
        str2 = new String(ch2);

        if(str1.equals(str2)){
            System.out.println("Это анаграмма");
        } else System.out.println("Это не анаграмма");
    }
}
