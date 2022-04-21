package com.company;

public class Code1_4 {
    public static void main(String[] args) {
        int count = 0;
        String str = "This generator allows to generate random text for testing purposes";
        int i = 0;
        for (i=0; i < str.length(); i++) {
            if (str.charAt(i)=='e')
                count++;
        }
        System.out.println("The symbol -e- occurs"+" " + count+ " " +"times");

    }
}
