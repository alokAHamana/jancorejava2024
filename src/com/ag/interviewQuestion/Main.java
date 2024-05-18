package com.ag.interviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = e1;
        Employee e3 = e1.clone();

        Map<Employee, String> map = new HashMap<>();

        map.put(e1, "Sachin");
        map.put(e2, "Ramesh");
        map.put(e3, "Tendulkar");

        System.out.println(map.get(e1)); // Output: Ramesh
        System.out.println(map.get(e2)); // Output: Ramesh
        System.out.println(map.get(e3)); // Output: Tendulkar
    }
}
