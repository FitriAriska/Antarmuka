/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan.Model;

/**
 *
 * @author Fitri Ariska
 */
public class Peminjam {
    private int idpeminjam;
    private String id_buku;
    private String nim;
    private String tanggal_pinjam;
    
    public Peminjam(){
        
    }

    public int getIdpeminjam() {
        return idpeminjam;
    }

    public void setIdpeminjam(int idpeminjam) {
        this.idpeminjam = idpeminjam;
    }

    public String getId_buku() {
        return id_buku;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getTanggal_pinjam() {
        return tanggal_pinjam;
    }

    public void setTanggal_pinjam(String tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }
    
    
    
}
