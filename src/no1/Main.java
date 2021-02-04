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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //objek baru
        Lingkaran a = new Lingkaran();
        Persegi b = new Persegi(); 
        
        //pilihan
        System.out.println("Anda ingin mengitung nilai luas bangun apa?");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();
        
        //percabangan
        switch(pilihan){
            case 1 : a.hitung(); //memanggil method
                break;
            case 2 : b.hitung(); //memanggil method
                break;
            default : System.out.println("Pilihan tidak ditemukan");
        }
    }
    
}
