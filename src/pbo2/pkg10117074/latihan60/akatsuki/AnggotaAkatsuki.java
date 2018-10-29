/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan60.akatsuki;

/**
 *
 * @author MY PC
 */
public class AnggotaAkatsuki extends KlanAkatsuki{
    private String anggota;
    
    public AnggotaAkatsuki(String nama, String klan, String pasangan) {
        super(nama, klan, pasangan);
        this.nama=nama;
        this.klan=klan;
        this.pasangan=pasangan;
    }

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }
    
}
