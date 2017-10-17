/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2lab;

/**
 *
 * @author Sigit Wicaksono
 */
public class Mainkan {
    public static void main(String [] args){
        Queue_di_LinkedList1 y = new Queue_di_LinkedList1();
        System.out.println("Apakah element kosong : "+y.isEmpty());
        y.add("Kelas A");
        y.add("Kelas B");
        y.add("Kelas C");
        y.add("Kelas D");
        y.add("Kelas E");
        y.add("Kelas F");
        y.add("Kelas G");
        System.out.println("Setelah data ditambahkan : "+y.toString());
        System.out.println("Element pertama : "+y.head());
        y.delete();
        System.out.println("Setelah data di hapus : "+y.toString());
    }
}
