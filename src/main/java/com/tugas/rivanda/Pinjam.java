package com.tugas.rivanda;

/**
 *
 * @author Rivanda
 */

public class Pinjam {
    
    String golongan;
    int nominalPinjam;
    int masaKerja;

    public Pinjam() {
    }

    public Pinjam(String golongan, int nominalPinjam, int masaKerja) {
        this.golongan = golongan;
        this.nominalPinjam = nominalPinjam;
        this.masaKerja = masaKerja;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public int getnominalPinjam() {
        return nominalPinjam;
    }

    public void setnominalPinjam(int nominalPinjam) {
        this.nominalPinjam = nominalPinjam;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }
    
    
    
}