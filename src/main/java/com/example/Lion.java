package com.example;
import java.util.List;
public class Lion {
    boolean hasMane;
    private Predator predator;
    public Lion (Predator feline, String sex) throws Exception  {
        this.predator = feline;
            if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    //Feline feline = new Feline(); //вынести из класса
    /*@Override
    public List<String> eatMeat() throws Exception {
        return null;
    }*/
    public int getKittens() {
        return predator.getKittens();
        }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        //return predator.getFood("Хищник");
        return predator.eatMeat();
    }
}
