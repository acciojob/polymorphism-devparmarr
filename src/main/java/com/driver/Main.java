package com.driver;

public class Main {
    Product p= new Product();
    int result1 = p.product(5, 10);
    int result2 = p.product(5, 10, 15);
    double result3 = p.product(5, 10);

}

class Product{
    public int product(int x, int y) {

        return x+y;
    }

    public int product(int x, int y, int z) {

        return x+y+z;
    }

    public double product(double x, double y) {

        return x+y;
    }
}