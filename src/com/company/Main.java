package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//
//        int[] array1 = new int[5];
//        array1[0] = 5;
//        array1[1] = 4;
//        array1[2] = 55;
//        array1[3] = 45;
//        array1[4] = 15;
//
//        int[] array2 = new int[10];
//
//        for(int i = 0; i < array1.length; i++){
//            array2[i] = array1[i];
//        }
//        for(int i = 0; i < array2.length; i++) {
//            System.out.println(array2[i]);
//        }

        // ======================================

//        ArrayList<Integer> numberList = new ArrayList<>();
//        numberList.add(5);
//        numberList.add(4);
//        numberList.add(55);
//        numberList.add(45);
//        numberList.add(6);
//
//        for(int i = 0; i < numberList.size(); i++){
//            System.out.print(numberList.get(i) + " ");
//        }
//        numberList.add(1, 8);
//        System.out.println("\n8 -> numberList -> index 1");
//        for(int i = 0; i < numberList.size(); i++){
//            System.out.print(numberList.get(i) + " ");
//        }

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add(0, "Aida" + 0);
        nameList.add(1,"Jantai" + 1);
        nameList.add(2, "Timur" + 2);
        nameList.add(3, "Azem" + 3);
        nameList.add(4, "Mansur" + 4);

        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }

        change(nameList, 10);
        System.out.println("============================ change" );


        for(int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        System.out.println("== indexOf(Jantai1)");
        System.out.println(nameList.indexOf("Jantai1"));
        System.out.println("== contains(Jantai1)");
        System.out.println(nameList.contains("Jantai1"));
        System.out.println("== contains(Alihan1)");
        System.out.println(nameList.contains("Alihan1"));

    }

    private static void change (ArrayList<String> nameList, int number){
        for(int i = 0; i < number; i++)
        nameList.add(1, "k" + 1);
    }
}

