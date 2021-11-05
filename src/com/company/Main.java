package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Dochka Garry= new Dochka("Garry", 50, true);
    Vnuchka Lisa= new Vnuchka("Lisa", 25, true);
    Vnuchka Marry= new Vnuchka("Marry", 20, false);
        System.out.println(Garry.toString() + Lisa.toString() + Marry.toString());
        Lisa.eat();
        Marry.eat();
    }


}
