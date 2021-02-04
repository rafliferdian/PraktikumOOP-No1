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
public class Lingkaran {
    //deklarasi
    double r, luas;
    
    //scanner
    Scanner input = new Scanner(System.in);
    
    //method
    void hitung(){
        System.out.print("\nMasukkan nilai jari-jari : ");
        r = input.nextDouble();
        
        //rumus luas
        luas = Math.PI * r * r;
        
        //output
        System.out.println("Luas : "+luas);

    }
}
