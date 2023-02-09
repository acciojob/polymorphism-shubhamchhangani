package com.driver;


public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int ans1 = p.product(5,10);
        System.out.println((ans1));
        int ans2 = p.product(5,10,20);
        System.out.println(ans2);
        double ans3 = p.product(10.00,20.00);
        System.out.println(ans3);
    }
}