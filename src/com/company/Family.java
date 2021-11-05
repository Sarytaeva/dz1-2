package com.company;

public class Family {
    private String surname;
    private int age;
    private boolean istick;

    private void speak(){
        System.out.println("I'm family");
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isIstick() {
        return istick;
    }

    public Family(String surname, int age, boolean istick) {
        this.surname = surname;
        this.age = age;
        this.istick = istick;
    }
}


