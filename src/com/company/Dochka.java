package com.company;

import java.util.Random;

public class Dochka extends Family {
    private String ColorEyes;
    private boolean eat;


    public Dochka(String surname, int age, boolean istick) {
        super(surname, age, istick);
    }
    public void eat(){
        System.out.println("i'm eating");



}
 public final void eat(boolean eat){
        if (eat){
            System.out.println("i'm not eating");
        } else {
            System.out.println("i'm eating");

        }


 } public  void iWantToEat(){
        System.out.println("Я хочу кушать");
    }

    public String getColorEyes() {
        return ColorEyes;
    }

    public boolean isEat() {
        return eat;
    }

    public void iWantToEat(boolean isGarry){
        if (isGarry){
            System.out.println("я не хочу кушать");
        }


    } @Override
    public String toString(){
        return "Dochka{" +
                " ColorEyes="+getColorEyes()+
                "eat" + eat+'}';

    }
}
