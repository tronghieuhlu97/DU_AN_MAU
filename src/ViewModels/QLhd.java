/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import java.util.Date;

/**
 *
 * @author Trong Hieu
 */
public class QLhd {
     private String id;
    private String idkh;
    private String idnv;
    private String ma;
    private Date ngaytao;
    private Date ngaythanhtoan;
    private Date ngayship;
    private Date ngaynhan;
    private int tinhtrang;
    private String tennguoinhan;
    private String diachi;
    private String sdt;

    public QLhd() {
    }

    public QLhd(String id, String idkh, String idnv, String ma, Date ngaytao, Date ngaythanhtoan, Date ngayship, Date ngaynhan, int tinhtrang, String tennguoinhan, String diachi, String sdt) {
        this.id = id;
        this.idkh = idkh;
        this.idnv = idnv;
        this.ma = ma;
        this.ngaytao = ngaytao;
        this.ngaythanhtoan = ngaythanhtoan;
        this.ngayship = ngayship;
        this.ngaynhan = ngaynhan;
        this.tinhtrang = tinhtrang;
        this.tennguoinhan = tennguoinhan;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public QLhd(String idkh, String idnv, String ma, Date ngaytao, Date ngaythanhtoan, Date ngayship, Date ngaynhan, int tinhtrang, String tennguoinhan, String diachi, String sdt) {
        this.idkh = idkh;
        this.idnv = idnv;
        this.ma = ma;
        this.ngaytao = ngaytao;
        this.ngaythanhtoan = ngaythanhtoan;
        this.ngayship = ngayship;
        this.ngaynhan = ngaynhan;
        this.tinhtrang = tinhtrang;
        this.tennguoinhan = tennguoinhan;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public String getIdnv() {
        return idnv;
    }

    public void setIdnv(String idnv) {
        this.idnv = idnv;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Date getNgaythanhtoan() {
        return ngaythanhtoan;
    }

    public void setNgaythanhtoan(Date ngaythanhtoan) {
        this.ngaythanhtoan = ngaythanhtoan;
    }

    public Date getNgayship() {
        return ngayship;
    }

    public void setNgayship(Date ngayship) {
        this.ngayship = ngayship;
    }

    public Date getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(Date ngaynhan) {
        this.ngaynhan = ngaynhan;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getTennguoinhan() {
        return tennguoinhan;
    }

    public void setTennguoinhan(String tennguoinhan) {
        this.tennguoinhan = tennguoinhan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

   

    
}
