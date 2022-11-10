package com.program;
// Crated by 21343015_siptya savira rahmi

public class L6_bus2 {
    private int penumpang;
    private int maxPenumpang;

    public L6_bus2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang = temp;
        }
    }

    public void cetak(){
        System.out.println("Penumpang bus sekarang : " + penumpang);
        System.out.println("Penumpang maks seharusya : " + maxPenumpang);
    }
}
