/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class UtsBmiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Selamat Datang=====");
        System.out.println("Jenis Kelamin");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.print("Masukkan pilihan jenis kelamin anda (1/2) : ");
        int pilihanKelamin = input.nextInt();
        
        System.out.println("Masukkan Tinggi Badan Anda : ");
        float tinggi = input.nextFloat();
        
        System.out.println("Masukkan Berat Badan Anda : ");
        float berat = input.nextFloat();
        
        UtsBmi UtsBmiApp = new UtsBmi(berat , tinggi);
        
        UtsBmiApp.getHasil(pilihanKelamin);
        
        input.close();
    }       
}
