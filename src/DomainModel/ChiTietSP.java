/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author Trong Hieu
 */
public class ChiTietSP {
    private String id;
    private String idsp;
    private String idnsx;
    private String idms;
    private String iddsp;
    private int nambh;
    private String mota;
    private int soluongton;
    private float gianhap;
    private float giaban;

    public ChiTietSP() {
    }

    public ChiTietSP(String id, String idsp, String idnsx, String idms, String iddsp, int nambh, String mota, int soluongton, float gianhap, float giaban) {
        this.id = id;
        this.idsp = idsp;
        this.idnsx = idnsx;
        this.idms = idms;
        this.iddsp = iddsp;
        this.nambh = nambh;
        this.mota = mota;
        this.soluongton = soluongton;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getIdnsx() {
        return idnsx;
    }

    public void setIdnsx(String idnsx) {
        this.idnsx = idnsx;
    }

    public String getIdms() {
        return idms;
    }

    public void setIdms(String idms) {
        this.idms = idms;
    }

    public String getIddsp() {
        return iddsp;
    }

    public void setIddsp(String iddsp) {
        this.iddsp = iddsp;
    }

    public int getNambh() {
        return nambh;
    }

    public void setNambh(int nambh) {
        this.nambh = nambh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoluongton() {
        return soluongton;
    }

    public void setSoluongton(int soluongton) {
        this.soluongton = soluongton;
    }

    public float getGianhap() {
        return gianhap;
    }

    public void setGianhap(float gianhap) {
        this.gianhap = gianhap;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        return "ChiTietSP{" + "id=" + id + ", idsp=" + idsp + ", idnsx=" + idnsx + ", idms=" + idms + ", iddsp=" + iddsp + ", nambh=" + nambh + ", mota=" + mota + ", soluongton=" + soluongton + ", gianhap=" + gianhap + ", giaban=" + giaban + '}';
    }

   
    
}
