package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class API2_3 {
    public static void main(String[] args) {
        List<String>  employees = Arrays.asList("Улащик", "Горбач","Биркевич","Авоськин","Аколев","Азимин");
        System.out.println(employees);

        List<String> collect = employees.stream().filter(i -> i.startsWith("А")).collect(Collectors.toList());
        System.out.println(collect);

    }
}
