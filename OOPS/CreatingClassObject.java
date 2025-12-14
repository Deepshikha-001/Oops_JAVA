package com.OOPS;

import java.util.Scanner;

public class CreatingClassObject {
    public static class Student{
        String name;
        int rno;
        double percent;
        // void print(){
        //     System.out.println(name+" "+rno+" "+percent);
        // }
    }
    

    // public static class Car{
    //     String name;
    //     String type;
    //     int price;
    // }


    // public static void fun(Student x){
    //     x.name = "Anjali";
    //     // System.out.println(x.name);
    // }

    public static void main(String args[]){
    //     class Student{
    //     String name;
    //     int rno;
    //     double percent;
    // }
    

    // class Car{
    //     String name;
    //     String type;
    //     int price;
    // }


    
       
        // Scanner sc = new Scanner(System.in); 
        Student s1 = new Student();
        s1.name = "Deepshikha";
        s1.rno = 2374;
        s1.percent = 98.5;

        Student s2 = new Student();
        s2.name = "Muskan";
        s2.rno = 2375;
        s2.percent = 99.5;

        // s1.print();
        // s2.print();

        System.out.println(s1.name);


        // System.out.println(s1.name+" "+s1.rno+" "+s1.percent);


        // System.out.println(s1.name);
        // fun(s1);
        // System.out.println(s1.name);



    //     Car c1 = new Car();
    //     c1.name = "Alto";
    //     c1.price = 400000;
    //     c1.type = "Hatchback";
    //     System.out.println(c1.name);



    // // Default values
    //     Student s1 = new Student();
    //     System.out.println(s1.name);
    //     System.out.println(s1.rno);
    //     System.out.println(s1.percent);



    }
}
