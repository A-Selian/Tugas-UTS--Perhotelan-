/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    static Scanner input = new Scanner(System.in);  // Create a Scanner object
    static int jumlahPengunjung=0;
    public static void Menu(){
        System.out.println("***************************************************");
        System.out.println("*         Selamat Datang di A-Z Hotel             *");
        System.out.println("*    Hotel dengan Full Spec No Kaleng-kaleng      *");
        System.out.println("***************************************************");
        System.out.print("Silakan Pilh Menu:\n1. Reservasi\n2. Kamar yang tersedia\n3. Perhitungan Hari ini \n4. Keuntungan \nPilih: ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                jumlahPengunjung++;
                new Reservation();
                break;
            case 2:
                Kamar kamar = new Kamar();
                kamar.displayReservedRooms();
                break;
            case 3: new Inspect();
                break;
            case 4: new Show();
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Menu();
    }
}