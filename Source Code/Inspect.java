
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class Inspect {
    static float totalOmset = Economy.harga + Bussiness.harga + Suite.harga;
    static float totalBiayaProduksi = 0.25f * Economy.harga + Bussiness.harga + Suite.harga;
    static float gajiKaryawan = 0.5f * totalBiayaProduksi;
    static float pajak = 0.1f * totalOmset;
    static float totalKeuntungan = (totalOmset - totalBiayaProduksi) - pajak;
    public Inspect(){
        System.out.println("Total Omset Penjualan: " + totalOmset);
        System.out.println("Gaji Karyawan dan Biaya Fasilitas Pendukung: " + gajiKaryawan);
        System.out.println("Biaya Produksi: " + totalBiayaProduksi);
        System.out.println("Biaya Pajak: " + pajak);
        System.out.println("Hasil Laba/Keuntungan Bersih : (totalOmset - BiayaProduksi) -  Pajak = " + totalKeuntungan);
        Main.Menu();
    }
}