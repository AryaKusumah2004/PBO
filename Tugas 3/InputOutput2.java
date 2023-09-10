/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputoutput.pkg2;

/**
 *
 * @author Arya Putra Kusumah
 */
import java.util.Scanner;

public class InputOutput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menambah garis === sebelum output
        
        
        // Membaca input secara berulang sampai tidak ada input lagi
        while (scanner.hasNext()) {
            String str = scanner.next();
            int num = scanner.nextInt();
            
            // Format output sesuai dengan spesifikasi
            System.out.println("================================");
            System.out.printf("%-15s%03d%n", str, num);
            System.out.println("================================");
        }
        
        
        scanner.close();
    }
}

