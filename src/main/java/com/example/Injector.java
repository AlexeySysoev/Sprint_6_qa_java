package com.example;

public class Injector {
    public static void main(String[] args) throws Exception {
        String[] sex = {"Самец","Самка"};
        Predator feline = new Feline();
        Lion lion = new Lion(feline, sex[1]);
        System.out.println(lion.getKittens());
        System.out.println(lion.getFood());
    }
}
