package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Klavyeeden girilen 3 sayının ortalaması
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
    }

}
