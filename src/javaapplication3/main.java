/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author MYWINDOWS
 */

class Data{
    double c, r, f, k;
}

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        boolean loop=true, loop1=true;
        
        Scanner input = new Scanner(System.in);
        Data temp = new Data();
        
        System.out.println("+--------------------------------------+");
        System.out.println("|WATER TEMPERATURE CONVERSION PROGGRGAM|");
        System.out.println("+--------------------------------------+\n");
        while (loop1){
            System.out.print("Input celcius : ");
            temp.c = input.nextDouble();
            loop=true;
            Conversion convers = new Conversion(temp.c);

            while (loop){
                System.out.println("\nOption");
                System.out.println("------");
                System.out.println("1. View Conversion Result");
                System.out.println("2. Edit Conversion Value");
                System.out.println("3. Exit\n");
                System.out.print("Choose : ");
                x = input.nextInt();
                switch (x) {
                    case 1:
                        convers.formula();
                        break;
                    case 2:
                        loop=false;
//                        System.out.print("Input celcius : ");
//                        temp.c = input.nextDouble();
                        break;
                    case 3:
                        loop=false;
                        loop1=false;
                        break;
                    default:
                        System.out.println("Option not available");
                        break;
                }
            }
        } 
    }
    
}
