package com.company;

public class Code1_9 {
    public static void main(String[] args) {

        System.out.println(calcFactorial(11));
    }

    static int calcFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;

    }
}
