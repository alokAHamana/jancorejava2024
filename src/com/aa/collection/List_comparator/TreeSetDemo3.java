package com.aa.collection.List_comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

    public static void main(String[] args) {
        
        TreeSet<Integer> treeSet = new TreeSet<Integer>(new MyComparator());
        
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(15);
        treeSet.add(3);
        
        System.out.println(treeSet);

    }

}