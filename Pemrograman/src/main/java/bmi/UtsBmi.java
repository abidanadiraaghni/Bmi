/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author PC
 */
public class UtsBmi {
    float berat;
    float tinggi;
    String JenisKelamin;
    
    // membuat constructor
    public UtsBmi (float berat , float tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }
    
    // membuat calculator bmi
    public float hitung () {
        float meter = tinggi / 100;
        return berat / (meter * meter);
    }
    
    // status 
    public String getStatus() {
        float bmi = hitung ();
        if(bmi < 19.5) {
            return "Kurus";
        }else if (bmi < 25.9){
            return "Normal";
        }else if (bmi < 27.9){
            return "Berat Ideal";
        }else if (bmi < 28.5){
            return "Berat Berlebihan";
        }else{
            return "Obesitas";
        }
    }
    public void getHasil(int pilihanKelamin){
        float bmi = hitung();
        System.out.println("=====Hasil=====");
        JenisKelamin = switch(pilihanKelamin) {
            case 1 ->
                "Laki-Laki";
            case 2 ->
                "Perempuan";
            default ->
                "Tidak Valid";
        };
        System.out.println("Jenis Kelamin : " + JenisKelamin);
        System.out.println("Bmi Anda : " + bmi);
        System.out.println("Status : " + getStatus());
        System.out.println("=====Terimaksaih=====");
    }
}
