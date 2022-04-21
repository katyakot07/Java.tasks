package com.company;

public class Code1_6 {

    public class IsStringPalindrome {
        public static void main(String[] args) {
            String str= "anna";
            System.out.println(isPalindrome(str));
        }

        public static boolean isPalindrome(String str) {
            return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
        }

    }
    }


