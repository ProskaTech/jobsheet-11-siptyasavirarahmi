package com.program;
// Crated by 21343015_siptya savira rahmi

public class L5_ujiBus {
    
    public static void main(String[] args){

        L5_bus busMini = new L5_bus();

        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;

        busMini.cetak();
        busMini.penumpang = busMini.penumpang + 5;

        busMini.cetak();

        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();

        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }

}
