package Sorting;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String [] args){
    sort x = new sort();
        Random y = new Random();
        Scanner z = new Scanner(System.in);
        int jumlah;
        System.out.println("Masukkan jumlah angka ");
        jumlah = z.nextInt();
        int [] hasil = new int[jumlah];
        for(int i = 1; i <= jumlah; i++){
            hasil[i-1] = 1 + y.nextInt(9);
            System.out.printf("%d ", hasil[i-1]);
            if (i % 10 == 0 ){
                System.out.println();
            }
        }
        System.out.println("1. Selection");
        System.out.println("2. insertion");
        System.out.println("3. bubble");
        System.out.println("Pilih metode pengurutan data");
        int pilih = z.nextInt();
        if(pilih == 1){
            x.selection(hasil);
            x.printArray(hasil);
        }
        else if(pilih == 2){
            x.insertion(hasil);
            x.printArray(hasil);
        }
        else if(pilih == 3){
            x.bubble(hasil);
            x.printArray(hasil);
        }
    }
}
