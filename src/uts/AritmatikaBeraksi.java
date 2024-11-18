/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author mochr
 */
public class AritmatikaBeraksi {
    public static void main(String[] args) {
        boolean isOver = false;
        Scanner scan = new Scanner(System.in);
        Aritmatika aritmatika = new Aritmatika();
        
        while (!isOver) {
            System.out.println("=============================");
            System.out.println("Pilih menu");
            System.out.println("1. Luas Segitiga");
            System.out.println("2. Luas Persegi Panjang");
            System.out.println("3. Luas Lingkaran");
            System.out.println("4. Keluar");
            System.out.println("=============================");
            System.out.println("Pilihan : ");
            int choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    boolean isTriangleOver = false;
                    int alas = 0, tinggi = 0;
                    double triangleResult = 0;
                    while (!isTriangleOver) {
                        System.out.println("Hitung Luas Segita");
                        System.out.println("1. input alas");
                        System.out.println("2. input tinggi");
                        System.out.println("3. Masukan rumus 0,5 * alas * tinggi");
                        System.out.println("4. Cetak Hasil");
                        System.out.print("Pilihan: ");
                        int triangleChoice = scan.nextInt();
                        
                        switch (triangleChoice) {
                            case 1:
                                System.out.print("Masuk Alas :");
                                alas = scan.nextInt();
                                break;
                            case 2:
                                System.out.print("Masukan Tinggi :");
                                tinggi = scan.nextInt();
                                break;
                            case 3:
                                if (triangleResult == 0) {
                                    if (alas == 0) {
                                        System.out.println("=======================================");
                                        System.out.println("Alas belum dimasukan");
                                        System.out.println("=======================================");
                                    } else if (tinggi == 0) {
                                        System.out.println("=======================================");
                                        System.out.println("Tinggi belum dimasukan");
                                        System.out.println("=======================================");
                                    } else {
                                        triangleResult = aritmatika.luasSegitiga(alas, tinggi);
                                        System.out.println("=======================================");
                                        System.out.println("Hitung Luas Segitiga! Berhasil!!!");
                                        System.out.println("=======================================");
                                    }                               
                                } else {
                                    System.out.println("===========================================================");
                                    System.out.println("Hitung Luas Segitiga! --> Segitiga Sudah Dihitung Kok");
                                    System.out.println("===========================================================");
                                }   break;
                            case 4:
                                if (triangleResult == 0) {
                                    System.out.println("=======================================");
                                    System.out.println("Luas Segitiganya belum dihitung!");
                                    System.out.println("=======================================");
                                } else {
                                    System.out.println("===========================================");
                                    System.out.println("Luas Segitiganya adalah : " + triangleResult);
                                    System.out.println("===========================================");
                                    isTriangleOver = true;
                                }   break;
                            default:
                                System.out.println("Gk ada Pilihan");
                                break;
                        }
                    }   break;
                case 2:
                    boolean isRectangleOver = false;
                    int panjang = 0, lebar = 0;
                    double rectangleResult = 0;
                    while (!isRectangleOver) {
                        System.out.println("Hitung Luas Persegi Panjang");
                        System.out.println("1. input Panjang");
                        System.out.println("2. input Lebar");
                        System.out.println("3. Masukan rumus p * l");
                        System.out.println("4. Cetak Hasil");
                        System.out.print("Pilihan: ");
                        int rectangleChoice = scan.nextInt();
                        
                        switch (rectangleChoice) {
                            case 1:
                                System.out.print("Masuk Panjang :");
                                panjang = scan.nextInt();
                                break;
                            case 2:
                                System.out.print("Masukan Lebar :");
                                lebar = scan.nextInt();
                                break;
                            case 3:
                                if (rectangleResult == 0) {
                                    if (panjang == 0) {
                                        System.out.println("=======================================");
                                        System.out.println("Panjang belum dimasukan");
                                        System.out.println("=======================================");
                                    } else if (lebar == 0) {
                                        System.out.println("=======================================");
                                        System.out.println("Lebar belum dimasukan");
                                        System.out.println("=======================================");
                                    } else {
                                        rectangleResult = aritmatika.luasSegitiga(panjang, lebar);
                                        System.out.println("==========================================");
                                        System.out.println("Hitung Luas Persegi Panjang! Berhasil!!!");
                                        System.out.println("==========================================");
                                    }
                                } else {
                                    System.out.println("======================================================================");
                                    System.out.println("Hitung Luas Persegi Panjang! --> Luas Persegi Panjang Sudah Dihitung Kok");
                                    System.out.println("======================================================================");
                                }   break;
                            case 4:
                                if (rectangleResult == 0) {
                                    System.out.println("=======================================");
                                    System.out.println("Luas Persegi Panjang belum dihitung!");
                                    System.out.println("=======================================");
                                } else {
                                    System.out.println("=====================================================");
                                    System.out.println("Luas Persegi Panjangnya adalah : " + rectangleResult);
                                    System.out.println("=====================================================");
                                    isRectangleOver = true;
                                }   break;
                            default:
                                System.out.println("Gk ada Pilihan");
                                break;
                        }
                    }   break;
                case 3:
                    boolean isCircleOver = false;
                    int jari_jari = 0;
                    double circleResult = 0;
                    while (!isCircleOver) {
                        System.out.println("Hitung Luas Lingkaran");
                        System.out.println("1. input r");
                        System.out.println("2. Masukan rumus 3,14 * r * r");
                        System.out.println("3. Cetak Hasil");
                        System.out.print("Pilihan: ");
                        int circleChoice = scan.nextInt();
                        
                        switch (circleChoice) {
                            case 1:
                                System.out.print("Masuk Jari-jari :");
                                jari_jari = scan.nextInt();
                                break;
                            case 2:
                                if (circleResult == 0) {
                                    if (jari_jari == 0) {
                                        System.out.println("=======================================");
                                        System.out.println("Jari-jari belum dimasukan");
                                        System.out.println("=======================================");
                                    } else {
                                        circleResult = aritmatika.luasLingkaran(jari_jari);
                                        System.out.println("============================================");
                                        System.out.println("Hitung Luas Lingkaran! Berhasil!!!");
                                        System.out.println("============================================");
                                    }
                                } else {
                                    System.out.println("====================================================================");
                                    System.out.println("Hitung Luas Lingkaran! --> Luas Persegi Panjang Sudah Dihitung Kok");
                                    System.out.println("====================================================================");
                                }   break;
                            case 3:
                                if (circleResult == 0) {
                                    System.out.println("=======================================");
                                    System.out.println("Luas Lingkaran belum dihitung!");
                                    System.out.println("=======================================");
                                } else {
                                    System.out.println("==================================================");
                                    System.out.println("Luas Lingkaran adalah : " + circleResult);
                                    System.out.println("==================================================");
                                    isCircleOver = true;
                                }   break;
                            default:
                                System.out.println("Gk ada pilihan");
                                break;
                        }
                    }   break;
                case 4:
                    isOver = true;
                    break;
                default:
                    System.out.println("=======================================");
                    System.out.println("Gk ada pilihannya!");
                    System.out.println("=======================================");
                    break;
            }
        }
    }
}
