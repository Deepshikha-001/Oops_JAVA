package com.OOPS;

public class thisKeyword {
    public static class Car{
        String name;
        int seats;

   
        // Car(String name , int seats){
        //     name = name;
        //     seats = seats;
        // } 

        Car(String name , int seats){
            this.name = name;
            this.seats = seats;
        }     

        void print(){
            int seats = 8;
            System.out.println(name+" "+seats);
            System.out.println(name+" "+this.seats);
        }
    }

    public static void main(String args[]){
        Car c1 = new Car("Mercedes", 6);
        c1.print();
    }
}
