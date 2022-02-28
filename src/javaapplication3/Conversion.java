/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author MYWINDOWS
 */
public class Conversion {
    double c, r, f, k;
    
    public Conversion(double c){
        this.c = c;
    }
    
    void formula(){
        r = (4*c)/5;
        f = ((9*c)/5)+32;
        k = c+273.15;
        System.out.println("\nCelcius    : "+c+"°C");
        System.out.println("Fahrenheit : "+f+"°F");
        System.out.println("Reamur     : "+r+"°R");
        System.out.println("Kelvin     : "+k+"°K");
        System.out.println("-------------------------");
        if(c<=0){
            System.out.println("Water is frozen");
        }else if(c>=100){
            System.out.println("Water is boiling");
        }else{
            System.out.println("Water condition is normal");
        }
    }
}
