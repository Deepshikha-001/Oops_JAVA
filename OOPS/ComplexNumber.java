package com.OOPS;

import java.util.Scanner;

class Complex{
    double x;
    double y;

    Complex(int x, int y){
        this.x = x;
        this.y = y;
    }
    Complex(){}
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }

    void add(Complex z){
        // z2.x = 8;
        x += z.x;
        y += z.y;
    }

    void mul(Complex z){
        x = x*z.x - y*z.y;
        y = x*z.y + y*z.x;
    }

    // void dividend(Complex z){
    //     x = ((x*z.x + y*z.y)/((z.x)*))
    // }
}

public class ComplexNumber {
   public static void main(String[] args){
       Complex z1 = new Complex(2, -5);
       Complex z2 = new Complex(3, 4);
       z1.print();
       z2.print();
       z1.add(z2);
       z2.print();
       z1.print();

       z2.mul(z1);
       z2.print();
   }
}
