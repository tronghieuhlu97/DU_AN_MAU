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
public class HoaDonChiTiet {
    private String idHD;
    private String idCTSP;
    private int soluong;
    private float dongia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String idHD, String idCTSP, int soluong, float dongia) {
        this.idHD = idHD;
        this.idCTSP = idCTSP;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public String getIdCTSP() {
        return idCTSP;
    }

    public void setIdCTSP(String idCTSP) {
        this.idCTSP = idCTSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

   
    
}
