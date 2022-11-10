package com.program;
// Crated by 21343015_siptya savira rahmi

public class L3_gajah extends L3_hewan {
    public static void testClassMethod(){
        System.out.println("The Class method in Hewan");
    }

    public void testIntanceMethode(){
        System.out.println("The Intance methode in Gajah");
    }

    public static void main(String args[]){
        L3_gajah myGajah = new L3_gajah();
        L3_hewan myHewan = myGajah;
        L3_hewan.testClassMethod();
        myHewan.testIntanceMethode();
    }
}
