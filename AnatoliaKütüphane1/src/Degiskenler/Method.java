/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Degiskenler;

/**
 * @author Onur Akbal-Emre Ertekin 
 */
public abstract class Method {
    private int isim;
    private String kitapadi;
    private int baski;
    private String yayimci;
    private int sayfasayisi;
    private int stok;

    public Method(int isim, String kitapadi, int baski, String yayimci, int sayfasayisi, int stok) {
        this.isim = isim;
        this.kitapadi = kitapadi;
        this.baski = baski;
        this.yayimci = yayimci;
        this.sayfasayisi = sayfasayisi;
        this.stok = stok;
    }
    
    abstract void KitapFonksiyonlari();
    

    public int getIsim() {
        return isim;
    }

    public void setIsim(int isim) {
        this.isim = isim;
    }

    public String getKitapadi() {
        return kitapadi;
    }

    public void setKitapadi(String kitapadi) {
        this.kitapadi = kitapadi;
    }

    public int getBaski() {
        return baski;
    }

    public void setBaski(int baski) {
        this.baski = baski;
    }

    public String getYayimci() {
        return yayimci;
    }

    public void setYayimci(String yayimci) {
        this.yayimci = yayimci;
    }

    public int getSayfasayisi() {
        return sayfasayisi;
    }

    public void setSayfasayisi(int sayfasayisi) {
        this.sayfasayisi = sayfasayisi;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    

    
   
    
    

}
