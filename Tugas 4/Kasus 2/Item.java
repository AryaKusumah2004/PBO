/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upinipin;

/**
 *
 * @author Arya Putra Kusumah
 */
public class Item {
    private String name;

    private Item() {
        name = "Ipin";
    }

    public Item(String name) {
        this(); // Memanggil konstruktor private
        System.out.println(this.name);
    }
}

