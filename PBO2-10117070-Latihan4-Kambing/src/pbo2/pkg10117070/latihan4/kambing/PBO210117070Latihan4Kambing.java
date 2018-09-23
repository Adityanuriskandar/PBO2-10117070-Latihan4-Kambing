/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan4.kambing;

/**
 *
 * @author Aditya
 * NAMA     : Aditya Nur Iskandar
 * KELAS    : PBO2/IF2
 * NIM      : 10117070
 * Deskripsi Program : Program ini berisi program untuk mengetahui pengguanaan 
 * variabel dan konstanta.
 */
public class PBO210117070Latihan4Kambing {
    public void tambahKambing() {
    //Deklarasi variabel lokal
    int jumlahKambing = 0;
    
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing setelah ditambahkan: " +
                jumlahKambing);
}

    public static void main(String[] args) {
        
        PBO210117070Latihan4Kambing kambingJantan = 
                new PBO210117070Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
