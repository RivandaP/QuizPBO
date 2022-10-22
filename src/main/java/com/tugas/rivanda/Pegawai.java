package com.tugas.rivanda;

/**
 *
 * @author Rivanda
 */

public class Pegawai {
   
    private String nip;
    private String nama;
    private String golongan;
    private int masaKerja;
    private char menikah;
    private int anak;
    
    public Pegawai(){
    }
    
    public Pegawai(String nip, String nama, String golongan, int masaKerja, char menikah, int anak){
        this.nip = nip;
        this.nama = nama;
        this.golongan =  golongan;
        this.masaKerja = masaKerja;
        this.menikah = menikah;
        this.anak = anak;
    }
    
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public char getMenikah() {
        return menikah;
    }

    public void setMenikah(char menikah) {
        this.menikah = menikah;
    }

    public int getAnak() {
        return anak;
    }

    public void setAnak(int anak) {
        this.anak = anak;
    }
    
    
    
    
    
}