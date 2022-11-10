package com.program;
// Crated by 21343015_siptya savira rahmi

public class L6_ujiBus2 {
    
    public static void main(String[] args){
        L6_bus2 busBesar = new L6_bus2(40);
        busBesar.cetak();

        busBesar.addPenumpang(15);
        busBesar.cetak();

        busBesar.addPenumpang(5);
        busBesar.cetak();

        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
    
}
