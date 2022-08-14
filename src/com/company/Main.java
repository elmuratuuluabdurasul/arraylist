package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random =new Random();

        ArrayList <Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 50; i++){
            arrayList.add(random.nextInt(100));
        }

        ArrayList <Integer> evenArrayList = new ArrayList<>();
        ArrayList <Integer>oddArrayList = new ArrayList<>();

        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0 ){
                evenArrayList.add(arrayList.get(i));
            }
            else{
                oddArrayList.add(arrayList.get(i));
            }
        }
        
        System.out.println("ArrayList: " + arrayList);
        System.out.println("evenArrayList: " + evenArrayList);
        System.out.println("oddArrayList: " + oddArrayList);




    }
}