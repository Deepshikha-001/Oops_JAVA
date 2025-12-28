package com.OOPS;

class ArrayList{
    int[] arr;
    int idx;
    int size;
    ArrayList(int capacity){
        arr = new int[capacity];
    }
    // void add(int ele){
    //     arr[idx++] = ele;
    //     size++;
    // }

    void add(int ele){
        if(idx == arr.length){   // array is full
             capacityincrease();        }
        arr[idx++] = ele;
        size++;
    }

    void capacityincrease(){
        int[] arr2 = new int[arr.length*2];
             for(int i=0; i<arr.length; i++){
                arr2[i] = arr[i];
             }
             arr = arr2;
    }


    // int capacity(){
    //     return arr.length;
    // }

    int get(int index){
       return arr[index];
    }
    void display(){
        for(int i=0; i<size;  i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(8);
        // System.out.println(arr.capacity());
        System.out.println(arr.size);
        arr.add(10); arr.add(20); arr.add(30);
        arr.display();

        System.out.println(arr.get(1));
        arr.add(40); arr.add(40); arr.add(40); arr.add(40); arr.add(40);
        arr.display();
    }
}
