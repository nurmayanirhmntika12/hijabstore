package com.example.hijabstore.model;

import java.io.Serializable;

public class Hijab implements Serializable {
    private String jenis;
    private String nama;
    private String bahan;
    private String deskripsi;
    private int drawableRes;

    public Hijab(String jenis, String nama, String bahan, String deskripsi, int drawableRes) {
        this.jenis = jenis;
        this.nama = nama;
        this.bahan = bahan;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}