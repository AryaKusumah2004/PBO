/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package berhitung;

/**
 *
 * @author Arya Putra Kusumah
 */
import java.util.Scanner;

public class Berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String operator = scanner.next();
        int B = scanner.nextInt();
        int result = 0;
        switch (operator) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                if (B != 0) {
                    result = A / B;
                } else {
                    System.out.println("Pembagian oleh nol tidak diizinkan.");
                    System.exit(1);
                }
                break;
            case "%":
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid.");
                System.exit(1);
        }
        if (A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
            System.out.println(result);
        } else {
            System.out.println("Input di luar batasan.");
        }

        scanner.close();
    }
}

