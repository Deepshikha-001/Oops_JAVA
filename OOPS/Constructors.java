package com.OOPS;

public class Constructors {
    public static class Car{
        String name;
        int seats;
        double length;
        Car(){   // non parameterised constructor
            name = "Default Car";
            seats = 4;
            length = 4.5;
        }

        Car(String s, int n, double d){
            name = s;
            seats = n;
            length = d;
        }

        void print(){
            System.out.println(name+" "+seats+" "+length);
        }
    }

    public static void main(String args[]){
        Car c1 = new Car("Kia Sonnet", 6, 6.7);
        System.out.println(c1.name);
        c1.print();

        c1.length = 7.8;    /// Can be modified.........
        c1.print();
;
        Car c2 = new Car("Lord Alto", 9, 8.9);
        c2.print();

        Car c3 = new Car();    // Error: constructor Car in class Car cannot be applied to given types;
        // Non parameterised constructor is not present
        c3.name = "Swift";
        c3.print();
    }
}
