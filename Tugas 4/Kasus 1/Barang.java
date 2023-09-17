/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barang;

/**
 *
 * @author Arya Putra Kusumah
 */
public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok " + nama_barang + " ditambah sebanyak " + jumlah);
        } else {
            System.out.println("Jumlah penambahan stok harus lebih dari 0.");
        }
    }

    public int getStok() {
        return stok;
    }

    public String getNamaBarang() {
        return nama_barang;
    }
}

