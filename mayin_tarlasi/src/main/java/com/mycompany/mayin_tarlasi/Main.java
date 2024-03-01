/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mayin_tarlasi;

import java.util.Scanner;

/**
 *
 * @author Yiğit
 */
public class Main {
public static void main (String[] args)
{   
    Scanner scan= new Scanner(System.in);
    int row,column;
    System.out.println("Mayin tarlasina hosgeldiniz ");
   // System.out.println("Lutfen oynamak istediginiz boyutlari giriniz ");
    //System.out.println("Satir sayisini giriniz: ");
    //row=scan.nextInt();
    //System.out.println("Sutun sayisini giriniz: ");
    //column=scan.nextInt();
    Mayin_tarlasi mayin= new Mayin_tarlasi(3,3);
    mayin.run();

}
 }