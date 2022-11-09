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
public class QLNv {

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
    private String idCH;
    private String idCV;
    private String idGBC;
    private int trangthai;

    public QLNv() {
    }

    public QLNv(String ma, String ten, String tendem, String ho, String gioitinh, Date ngaysinh, String diachi, String sdt, String matkhau, String idCH, String idCV, int trangthai) {
        this.ma = ma;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.matkhau = matkhau;
        this.idCH = idCH;
        this.idCV = idCV;
        this.trangthai = trangthai;
    }

   

    public QLNv(String id, String ma, String ten, String tendem, String ho, String gioitinh, Date ngaysinh, String diachi, String sdt, String matkhau, String idCH, String idCV, String idGBC, int trangthai) {
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
        this.idCH = idCH;
        this.idCV = idCV;
        this.idGBC = idGBC;
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

    public String getIdCH() {
        return idCH;
    }

    public void setIdCH(String idCH) {
        this.idCH = idCH;
    }

    public String getIdCV() {
        return idCV;
    }

    public void setIdCV(String idCV) {
        this.idCV = idCV;
    }

    public String getIdGBC() {
        return idGBC;
    }

    public void setIdGBC(String idGBC) {
        this.idGBC = idGBC;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "QLNv{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", tendem=" + tendem + ", ho=" + ho + ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh + ", diachi=" + diachi + ", sdt=" + sdt + ", matkhau=" + matkhau + ", idCH=" + idCH + ", idCV=" + idCV + ", idGBC=" + idGBC + ", trangthai=" + trangthai + '}';
    }

    

   
    

}
