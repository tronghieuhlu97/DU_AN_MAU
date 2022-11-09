/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.DongSP;
import DomainModel.HoaDon;
import Utilities.DBConnection;
import ViewModels.QLCtsp;
import ViewModels.QLhd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class HoaDonRepository implements IHoaDonRepository {

    @Override
    public List<HoaDon> getAll() {
        String query = "SELECT * FROM HOADON";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<HoaDon> lstHD = new ArrayList<>();
            while (rs.next()) {
                // ChiTietSP chiTietSP = new ChiTietSP(rs.getString(1), _iSanPhamRepository.getSanPhamById(rs.getString(2)), _iNsxRepository.getNsxById(rs.getString(3)), _iMauSacRepository.getById(rs.getString(4)), _iDongSPRepository.getDongSPById(rs.getString(5)), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getFloat(9), rs.getFloat(10));
                // QLhd qlhd = new QLhd(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getDate(7), rs.getDate(8), rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12));
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getDate(7), rs.getDate(8), rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12));
                lstHD.add(hd);
            }
            return lstHD;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public HoaDon getById(String id) {
        String query = "SELECT * FROM HOADON WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            HoaDon hd = new HoaDon();

            if (rs.next()) {
                hd = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getDate(7), rs.getDate(8), rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12));
            }
            return hd;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;

    }

    @Override
    public boolean Add(HoaDon hoadon) {
        int check = 0;
        String sql = "INSERT INTO HOADON (IDKH,IDNV,MA,NGAYTAO,NGAYTHANHTOAN,NGAYSHIP,NGAYNHAN,TINHTRANG,TENNGUOINHAN,DIACHI,SDT) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, hoadon.getIdkh());
            ps.setObject(2, hoadon.getIdnv());
            ps.setObject(3, hoadon.getMa());
            ps.setObject(4, hoadon.getNgaytao());
            ps.setObject(5, hoadon.getNgaythanhtoan());
            ps.setObject(6, hoadon.getNgayship());
            ps.setObject(7, hoadon.getNgaynhan());
            ps.setObject(8, hoadon.getTinhtrang());
            ps.setObject(9, hoadon.getTennguoinhan());
            ps.setObject(10, hoadon.getDiachi());
            ps.setObject(11, hoadon.getSdt());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean Update(String id, HoaDon hoadon) {
        int check = 0;
        String sql = "UPDATE HoaDon SET IdKH = ?,IdNV = ?,MA = ?, NgayTao = ?,NgayThanhToan = ?,NgayShip = ?,NgayNhan = ?,TinhTrang = ?,TenNguoiNhan = ?,DiaChi = ?,Sdt = ? WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, hoadon.getIdkh());
            ps.setObject(2, hoadon.getIdnv());
            ps.setObject(3, hoadon.getMa());
            ps.setObject(4, hoadon.getNgaytao());
            ps.setObject(5, hoadon.getNgaythanhtoan());
            ps.setObject(6, hoadon.getNgayship());
            ps.setObject(7, hoadon.getNgaynhan());
            ps.setObject(8, hoadon.getTinhtrang());
            ps.setObject(9, hoadon.getTennguoinhan());
            ps.setObject(10, hoadon.getDiachi());
            ps.setObject(11, hoadon.getSdt());
            ps.setObject(12, id);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    @Override
    public boolean Delete(String id) {
        int check = 0;
        String sql = "DELETE FROM HOADON WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
