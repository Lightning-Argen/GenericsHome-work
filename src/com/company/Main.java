package com.company;

public class Main {
    public static void main(String[] args) {

        Box<String,Integer,String> box =new Box<>(18,"1 м","Посылка из Japon");
        System.out.println(Box.sity(box));
    }
}