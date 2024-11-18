/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author mochr
 */
public class Aritmatika implements IAritmaka{
    public double luasSegitiga(int alas, int tinggi) {
        double result = 0.5 * alas * tinggi;
                
        return result;
    }
    
    public double luasPersegiPanjang(int panjang, int lebar) {
        double result = panjang * lebar;
        
        return result;
    }
    
    public double luasLingkaran(int jari_jari) {
        double result = 3.14 * jari_jari * jari_jari;
        
        return result;
    }
}
