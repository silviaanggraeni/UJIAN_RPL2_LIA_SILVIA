/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.parfum.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author salis
 */
@Entity
@Table(name = "toko_parfum")
public class TokoParfum implements Serializable {
    @Id
    @Column(name = "kd_parfum", length = 15)
    private String kd_parfum;
    @Column(name = "nama", length = 25)
    private String nama;
    @Column(name = "jenis", length = 20)
    private String jenis;
    @Column(name = "ukuran", length = 10)
    private String ukuran;
    @Column(name = "harga", length = 15)
    private int harga;

    public String getKd_parfum() {
        return kd_parfum;
    }

    public void setKd_parfum(String kd_parfum) {
        this.kd_parfum = kd_parfum;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
    
}
