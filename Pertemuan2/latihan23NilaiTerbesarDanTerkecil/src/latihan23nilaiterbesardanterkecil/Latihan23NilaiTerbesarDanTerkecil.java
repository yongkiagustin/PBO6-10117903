/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : - membuat fungsi nilai terbesar dan terkecil
 */
package latihan23nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author YoungDragoon
 */
public class Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String petugas;
        int banyakMahasiswa; 
        int terbesar;
        int terkecil;
        int nilaiMaha;
        Scanner input = new Scanner(System.in);
        
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = input.next();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMahasiswa = input.nextInt();
        

        terbesar = 0;
        terkecil = 100;
        
        for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilaiMaha = input.nextInt();
            
            terbesar = ((terbesar<=nilaiMaha)?nilaiMaha:terbesar);
            terkecil = ((terkecil>=nilaiMaha)?nilaiMaha:terkecil);
        }
        
        System.out.println("\nNama Petugas :" +petugas);
        System.out.print("\nNilai Terbesar adalah : "+ terbesar);
        System.out.println("\nNilai Terkecil adalah : "+ terkecil);
        
        
    }
    
}
