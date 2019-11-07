/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan51.gaji;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung gaji total karyawan
 */
public class PBO210118048Latihan51Gaji {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        Manager manager = new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        karyawan.setNik(scanner.nextLine());
        System.out.print("Masukkan Nama : ");
        karyawan.setNama(scanner.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        karyawan.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        karyawan.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t: " + karyawan.getNik());
        System.out.println("NAMA\t: " + karyawan.getNama());
        System.out.println("GOLONGAN: " + karyawan.getGolongan());
        System.out.println("JABATAN\t: " + karyawan.getJabatan());
        System.out.println("\nTUNJANGAN GOLONGAN\t: " + manager.tunjanganGolongan
                            (karyawan.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " + manager.tunjanganJabatan
                            (karyawan.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + manager.tunjanganKehadiran
                            (manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t: " + manager.gajiTotal());
    }

}
