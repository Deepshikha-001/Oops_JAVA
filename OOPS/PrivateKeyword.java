package com.OOPS;

import java.util.Scanner;

class Student{
        String name;    // null
        private int rno = 4;
        double cgpa;    // 0.0
        void print(){    //getter
            System.out.println(name+" "+rno+" "+cgpa);
        }

        // getter and setter are applicable in case of private data members only

        int getrno(){   //getter
            return rno;
        }

        void setrno(int x){  //setter
            rno = x;
        }
    }

public class PrivateKeyword {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.print();


        s1.name = "Anjali";
        // s1.rno = 23;
        s1.cgpa = 8.35;
        s1.print();
        // System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);


        System.out.println(s1.name+" "+s1.getrno()+" "+s1.cgpa);


        s1.setrno(24);
        System.out.println(s1.name+" "+s1.getrno()+" "+s1.cgpa);

        

        /// Taking input within StringBuilder..........
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);


    }
}
