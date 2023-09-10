/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gajiagent;

/**
 *
 * @author Arya Putra Kusumah
 */
import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPenjualan = scanner.nextInt();
        int gajiPokok = 500000;
        int hargaItem = 50000;
        double bonus = 0;
        if (totalPenjualan >= 15) {
            if (totalPenjualan >= 40) {
                bonus = totalPenjualan * hargaItem * 0.25;
            } else if (totalPenjualan > 80) {
                bonus = totalPenjualan * hargaItem * 0.35;
            } else {
                bonus = totalPenjualan * hargaItem * 0.10;
            }
        } else {
            double denda = (15 - totalPenjualan) * hargaItem * 0.15;
            gajiPokok -= denda;
        }
        int totalGaji = gajiPokok + (int) bonus;
        System.out.println(totalGaji);

        scanner.close();
    }
}

