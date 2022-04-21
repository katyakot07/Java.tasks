package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class API2_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Collections.sort(list);

        list.stream().map(i -> ((i%2==0) ? (i*100) : (i-100))).forEach(System.out::println);

    }
}

