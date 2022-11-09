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
public class QLKhachHang {
    private String id;
    private String ma;
    private String ten;
    private String tendem;
    private String ho;
    private Date ngaysinh;
    private String sdt;
    private String diachi;
    private String thanhpho;
    private String quocgia;
    private String matkhau;

    public QLKhachHang() {
    }

    public QLKhachHang(String id, String ma, String ten, String tendem, String ho, Date ngaysinh, String sdt, String diachi, String thanhpho, String quocgia, String matkhau) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
        this.matkhau = matkhau;
    }

    public QLKhachHang(String ma, String ten, String tendem, String ho, Date ngaysinh, String sdt, String diachi, String thanhpho, String quocgia, String matkhau) {
        this.ma = ma;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
        this.matkhau = matkhau;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    
    
}
