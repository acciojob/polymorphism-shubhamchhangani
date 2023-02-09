package com.driver;

class Product{
    public int product(int x, int y){
        return x*y;
    }

    public int product(int x, int y, int z){
        return x*y*z;
    }

    public double product(double x, double y){
        return x*y;
    }
}
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