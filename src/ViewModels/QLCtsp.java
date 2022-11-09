/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

/**
 *
 * @author Trong Hieu
 */
public class QLCtsp {

    private String id;
    private String tensp;
    private String tennsx;
    private String tenms;
    private String tendsp;
    private int nambh;
    private String mota;
    private int soluongton;
    private float gianhap;
    private float giaban;

    public QLCtsp() {
    }

    public QLCtsp(String tensp, String tennsx, String tenms, String tendsp, int nambh, String mota, int soluongton, float gianhap, float giaban) {
        this.tensp = tensp;
        this.tennsx = tennsx;
        this.tenms = tenms;
        this.tendsp = tendsp;
        this.nambh = nambh;
        this.mota = mota;
        this.soluongton = soluongton;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

    public QLCtsp(String id, String tensp, String tennsx, String tenms, String tendsp, int nambh, String mota, int soluongton, float gianhap, float giaban) {
        this.id = id;
        this.tensp = tensp;
        this.tennsx = tennsx;
        this.tenms = tenms;
        this.tendsp = tendsp;
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

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getTennsx() {
        return tennsx;
    }

    public void setTennsx(String tennsx) {
        this.tennsx = tennsx;
    }

    public String getTenms() {
        return tenms;
    }

    public void setTenms(String tenms) {
        this.tenms = tenms;
    }

    public String getTendsp() {
        return tendsp;
    }

    public void setTendsp(String tendsp) {
        this.tendsp = tendsp;
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
        return "QLCtsp{" + "id=" + id + ", tensp=" + tensp + ", tennsx=" + tennsx + ", tenms=" + tenms + ", tendsp=" + tendsp + ", nambh=" + nambh + ", mota=" + mota + ", soluongton=" + soluongton + ", gianhap=" + gianhap + ", giaban=" + giaban + '}';
    }
    
    
}
