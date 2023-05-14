/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.awt.*;

/**
 *
 * @author user
 */
public class Receipt {
    public void showReceiptEconomy(float harga, int hari) {
        float biayaSewa = harga;
        float biayaTambahan = 50000;
        float biayaKeuntungan = biayaSewa * 5 / 100;
        float total = biayaSewa + biayaTambahan + biayaKeuntungan;
        System.out.println("==========STRUK PEMBAYARAN==========");
        System.out.println("Kelas Kamar: Economy");
        System.out.println("Jumlah Hari Menginap: " + hari);
        System.out.println("Biaya Sewa: " + "Rp " + biayaSewa);
        System.out.println("Biaya Tambahan (Wifi, Air, Listrik): " + "Rp " + biayaTambahan);
        System.out.println("Pajak Reservasi: " + "Rp " + biayaKeuntungan);
        System.out.println("Total Pembayaran: " + "Rp " + total);
        System.out.println("Terima kasih telah memesan kamar di hotel kami!");
        Main.Menu();
    }
    public void showReceiptBussiness(float harga, int hari) {
        float biayaSewa = harga;
        float biayaTambahan = 50000;
        float biayaKeuntungan = biayaSewa * 5 / 100;
        float total = biayaSewa + biayaTambahan + biayaKeuntungan;
        System.out.println("==========STRUK PEMBAYARAN==========");
        System.out.println("Kelas Kamar: Bussiness");
        System.out.println("Jumlah Hari Menginap: " + hari);
        System.out.println("Biaya Sewa: " + "Rp " + biayaSewa);
        System.out.println("Biaya Tambahan (Wifi, Air, Listrik): " + "Rp " + biayaTambahan);
        System.out.println("Pajak Reservasi: " + "Rp " + biayaKeuntungan);
        System.out.println("Total Pembayaran: " + "Rp " + total);
        System.out.println("Terima kasih telah memesan kamar di hotel kami!");
        Main.Menu();
    }
    public void showReceiptSuite(float harga, int hari) {
        float biayaSewa = harga;
        float biayaTambahan = 50000;
        float biayaKeuntungan = biayaSewa * 5 / 100;
        float total = biayaSewa + biayaTambahan + biayaKeuntungan;
        System.out.println("==========STRUK PEMBAYARAN==========");
        System.out.println("Kelas Kamar: Suite");
        System.out.println("Jumlah Hari Menginap: " + hari);
        System.out.println("Biaya Sewa: " + "Rp " + biayaSewa);
        System.out.println("Biaya Tambahan (Wifi, Air, Listrik): " + "Rp " + biayaTambahan);
        System.out.println("Reservasi: " + "Rp " + biayaKeuntungan);
        System.out.println("Total Pembayaran: " + "Rp " + total);
        System.out.println("Terima kasih telah memesan kamar di hotel kami!");
        Main.Menu();
    }
}