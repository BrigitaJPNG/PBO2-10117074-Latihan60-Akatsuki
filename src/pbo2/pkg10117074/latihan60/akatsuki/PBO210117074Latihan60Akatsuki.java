/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan60.akatsuki;

/**
 *Nama  : Brigita Julia Puspita Nai Goncalves
 *Kelas : PBO2
 *NIM   : 10117074
 *Deskripsi Program : program ini berisi program yang berisikan karakter dari 
 *                    dari serial Naruto
 */
public class PBO210117074Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PemimpinAkatsuki pa = new PemimpinAkatsuki("Pain");
        pa.setPemimpin("Pemimpin");
        pa.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + pa.getPemimpin());
        
        System.out.println("");
    
        AnggotaAkatsuki aa = new AnggotaAkatsuki("Uchiha");
        aa.setAnggota("Anggota");
        aa.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + aa.getAnggota());
        System.out.println("");
    }
    
}
