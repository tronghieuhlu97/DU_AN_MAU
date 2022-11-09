/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Date;

/**
 *
 * @author Trong Hieu
 */
public class NhanVien {
    private String id;
    private String ma;
    private String ten;
    private String tendem;
    private String ho;
    private String gioitinh;
    private Date ngaysinh;
    private String diachi;
    private String sdt;
    private String matkhau;
    private String idch;
    private String idcv;
    private String idguibc;
    private int trangthai;

    public NhanVien() {
    }

    public NhanVien(String id, String ma, String ten, String tendem, String ho, String gioitinh, Date ngaysinh, String diachi, String sdt, String matkhau, String idch, String idcv, String idguibc, int trangthai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.matkhau = matkhau;
        this.idch = idch;
        this.idcv = idcv;
        this.idguibc = idguibc;
        this.trangthai = trangthai;
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
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

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getIdch() {
        return idch;
    }

    public void setIdch(String idch) {
        this.idch = idch;
    }

    public String getIdcv() {
        return idcv;
    }

    public void setIdcv(String idcv) {
        this.idcv = idcv;
    }

    public String getIdguibc() {
        return idguibc;
    }

    public void setIdguibc(String idguibc) {
        this.idguibc = idguibc;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

  
}
