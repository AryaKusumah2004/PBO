/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barang;

/**
 *
 * @author Arya Putra Kusumah
 */
public class Inventori {
    private Barang[] barangs;

    public Inventori() {
        barangs = new Barang[2];
    }

    void initBarang() {
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + "(" + barangs[1].getStok() + ")");
    }

    void pengadaan() {
        initBarang();
        barangs[0].tambahStok(20);
        barangs[1].tambahStok(30);
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}







