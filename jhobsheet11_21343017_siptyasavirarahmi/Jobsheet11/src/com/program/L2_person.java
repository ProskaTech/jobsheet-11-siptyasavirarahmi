package com.program;
// Crated by 21343015_siptya savira rahmi

public class L2_person {
    protected String name;
    protected int age;

    public L2_person (String name,int age){
        this.name=name;
        this.age=age;
    }

    public void info(){
        System.out.println("nama : "+this.name);
        System.out.println("usia : "+this.age);
    }
}
