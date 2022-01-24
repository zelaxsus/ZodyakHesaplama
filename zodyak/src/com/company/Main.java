package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String zodyak="Çin Zodyağı Burcunuz : ";
        Scanner inp=new Scanner(System.in);
        int month=12;
        int bornDate,sonuc;

        System.out.println("Doğduğunuz Yılı Girinizi");
        bornDate=inp.nextInt();
        sonuc=bornDate%12;
            if (sonuc==1)
            {
                System.out.println(zodyak +"Horoz");
            }
            if(sonuc==2)
            {
                System.out.println(zodyak +"Köpek");
            }
            if(sonuc==3)
            {
                System.out.println(zodyak +"Domuz");
            }
            if(sonuc==4)
            {
                System.out.println(zodyak +"Fare");
            }
            if(sonuc==5)
            {
                System.out.println(zodyak +"Öküz");
            }
            if(sonuc==6)
            {
                System.out.println(zodyak +"Kaplan");
            }
            if(sonuc==7)
            {
                System.out.println(zodyak +"Tavşan");
            }
            if(sonuc==8)
            {
                System.out.println(zodyak +"Ejderha");
            }
            if(sonuc==9)
            {
                System.out.println(zodyak +"Yılan");
            }
            if(sonuc==10)
            {
                System.out.println(zodyak +"At");
            }
            if(sonuc==11){
                System.out.println(zodyak +"Koyun");
            }

        if(sonuc==0){
            System.out.println(zodyak +"Maymun");
        }


        }
    }

