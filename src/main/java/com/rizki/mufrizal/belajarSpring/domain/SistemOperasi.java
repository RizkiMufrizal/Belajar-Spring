package com.rizki.mufrizal.belajarSpring.domain;

/**
 * Created by rizki on 28/07/15.
 */
public class SistemOperasi {

    private String namaSistemOperasi;
    private String versiSistemOperasi;

    public String getNamaSistemOperasi() {
        return namaSistemOperasi;
    }

    public void setNamaSistemOperasi(String namaSistemOperasi) {
        this.namaSistemOperasi = namaSistemOperasi;
    }

    public String getVersiSistemOperasi() {
        return versiSistemOperasi;
    }

    public void setVersiSistemOperasi(String versiSistemOperasi) {
        this.versiSistemOperasi = versiSistemOperasi;
    }

    @Override
    public String toString() {
        return "Sistem Operasi anda adalah " + getNamaSistemOperasi() + " Dengan Versi " + getVersiSistemOperasi();
    }
}
