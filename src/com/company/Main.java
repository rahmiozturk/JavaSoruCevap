package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //1. Klavyeeden girilen 3 sayının ortalaması

     /*
        int x,y,z;
        double ortalama;

        Scanner tara=new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz");
        x=tara.nextInt();

        System.out.println("İkinci sayıyı girin");
        y=tara.nextInt();

        System.out.println("Üçüncü sayıyı girin");
        z=tara.nextInt();

        ortalama=(x+y+z)/3d;

        System.out.println("Girilen sayıların ortalaması:" + ortalama);

     */

     /*
        //2. Klavyeden kenarları verilen üçgenin çeşitini bilin

        int x,y,z;

        Scanner tara = new Scanner(System.in);

        System.out.println("1. kenarı girin");
        x=tara.nextInt();

        System.out.println("2. kenar girin");
        y = tara.nextInt();

        System.out.println("3. kenarı girin");
        z=tara.nextInt();

        if(x==y && y==z){
        System.out.println("üçgen eşkenar");

        }else if (x!=y && y!=z && x!=z) {
        System.out.println("üçgen çeşitkenar");

        }else{
          System.out.println("üçgen ikizkenar");
        }
        */

        // Vize ve Final Notuna göre geçti kaldı


        int vize,finalnotu;
        double ortalama;

        Scanner tara =new Scanner(System.in);

        System.out.println("vize notunu girin");
        vize=tara.nextInt();

        System.out.println("Final notunu girin");
        finalnotu=tara.nextInt();

        ortalama = 0.4 * vize + 0.6 * finalnotu ;

        if(ortalama>50){
            System.out.println("Dersi geçtiniz ortalamanız :"+ ortalama);

        }else{
            System.err.println("Kaldınız ortalamınız :"+ ortalama);
        }
        }

    }


