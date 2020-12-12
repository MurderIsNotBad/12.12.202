package com.hillel;

public class Bull {

    public static  final String BULL_CREATED = "Bull created";
    public static  final String BULL_CREATED_WITH_NAME = "Bull created with name";
    public static int COUNT;
    int power;
    String name;



    public Bull(){
        COUNT++;
        System.out.println(BULL_CREATED);
    }

    public Bull(int power){
        COUNT++;
        this.name = name;
        this.power = power;
        System.out.println(BULL_CREATED_WITH_NAME);
    }





    public static int getCOUNT(){
        System.out.println("Bulls: " + COUNT);
        return COUNT;
    }
    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power = power;
    }
    public boolean fight(Bull bull){
        if(this.getPower() > bull.getPower()){
            System.out.println("firs win");
            return true;
        }else if (this.getPower() < bull.getPower()){
            System.out.println("second win");
            return false;
        }
        return false;
    }

}
