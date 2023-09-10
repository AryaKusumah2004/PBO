/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bukatutupjalan;

/**
 *
 * @author Arya Putra Kusumah
 */
import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca plat nomor untuk 4 mobil
        String[] platNomor = scanner.nextLine().split(" ");

        // Menghitung total plat nomor
        int total = 0;
        for (String plat : platNomor) {
            int nomorMobil = Integer.parseInt(plat);
            total += nomorMobil;
        }

        // Memeriksa apakah harus berhenti atau melanjutkan
        if ((total - 999999) % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }

        scanner.close();
    }
}


