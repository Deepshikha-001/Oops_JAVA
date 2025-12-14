package com.OOPS;

import java.util.Scanner;

public class ConstOverloading {
    public static class Car{
        String name;
        int seats;
        double length;
        Car(){
            name = "Deafault Car";
            seats = 4;
            length = 9.8;
        }

        Car(String s, int x){
            name = s;
            seats = x;
        }

        Car(String s, int x, double d){
            name = s;
            seats = x;
            length = d;
        }

        void print(){
            System.out.println(name+" "+seats+" "+length);
        }
    }

    public static void main(String args[]){
        Car c1 = new Car();
        c1.print();
        Car c2 = new Car("Mercedes", 6);   // Parameters should be in the same order as defined in constructor
        c2.print();
        Car c3 = new Car("Thar", 6, 4.5);
        c3.print();
        
    }
}
