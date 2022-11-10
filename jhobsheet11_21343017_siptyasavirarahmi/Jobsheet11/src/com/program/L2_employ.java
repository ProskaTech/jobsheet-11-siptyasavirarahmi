package com.program;
// Crated by 21343015_siptya savira rahmi

public class L2_employ extends L2_person {
    private String noKaryawan;

    public L2_employ(String noKaryawan,String name,int age){
        super (name,age);
        this.noKaryawan= noKaryawan;
    }

    public void info(){
        System.out.println("no. karyawan :" + this.noKaryawan);
        super.info();
    } 
}
