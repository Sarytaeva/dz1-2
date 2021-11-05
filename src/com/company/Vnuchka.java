package com.company;

final public class Vnuchka  extends  Dochka{
    private EnumColorEyes enumColorEyes;


    public Vnuchka(String surname, int age, boolean istick) {
        super(surname, age, istick);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("у меня нет аппетита");

    }
    public void Lisa(){
        System.out.println("Лиса идет домой");
    } public com.company.EnumColorEyes getEnumColorEyes(){
        return enumColorEyes;

    }
    @Override
    public String toString(){
        return "Vnuchka{" +"EnamColorEyes" +enumColorEyes + "}";
    }

}

