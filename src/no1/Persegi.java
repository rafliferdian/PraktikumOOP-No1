/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Persegi {
    //deklarasi
    double s, luas;
    
    //scanner
    Scanner input = new Scanner(System.in);
    
    //method
    void hitung(){
        System.out.print("\nMasukkan nilai sisi : ");
        s = input.nextDouble();
        
        //rumus luas
        luas = s * s;
        
        //output
        System.out.println("Luas : "+luas);
    }
}
