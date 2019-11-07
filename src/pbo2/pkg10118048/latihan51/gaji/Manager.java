/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan51.gaji;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung gaji total karyawan
 */
public class Manager extends Karyawan{
    
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = kehadiran * 10_000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan) {
        switch (jabatan) {
            case "Manager":
                tunjanganJabatan = 2_000_000;
                break;
            case "Kabag":
                tunjanganJabatan = 1_000_000;
                break;
            default:
                tunjanganJabatan = 0;
                break;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan) {
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500_000;
                break;
            case 2:
                tunjanganGolongan = 1_000_000;
                break;
            case 3:
                tunjanganGolongan = 1_500_000;
                break;
            default:
                tunjanganGolongan = 0;
                break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal() {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
    
}
