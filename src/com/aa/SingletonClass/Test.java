package com.aa.SingletonClass;
public class Test {

    public static void main(String[] args) {
        
        Test t1 = new Test();
        
        Test t2 = new Test();
        
        Test t3 = new Test();
        
    //    System.out.println(t1.hashCode());
        
    //    System.out.println(t2.hashCode());
        
    //    System.out.println(t3.hashCode());
        
        
        Runtime r1 = Runtime.getRuntime();
        
        Runtime r2 = Runtime.getRuntime();
        
        //Runtime r3 = new Runtime();
        
        System.out.println(r1.hashCode());
        
        System.out.println(r2.hashCode());
        
        
        
    }

}