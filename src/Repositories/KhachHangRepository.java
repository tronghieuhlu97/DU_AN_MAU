/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.KhachHang;
import DomainModel.MauSac;
import DomainModel.NhanVien;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class KhachHangRepository implements IKhachHangRepository {

    @Override
    public List<KhachHang> getAll() {
        String query = "SELECT * FROM KHACHHANG";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<KhachHang> lstKhachHang = new ArrayList<>();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                lstKhachHang.add(kh);
            }
            return lstKhachHang;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public KhachHang getKHById(String id) {
        String query = "SELECT * FROM KHACHHANG WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                return kh;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(KhachHang khachhang) {
        int check = 0;
        String sql = "INSERT INTO KHACHHANG(MA,TEN,TENDEM,HO,NGAYSINH,SDT,DIACHI,THANHPHO,QUOCGIA,MATKHAU) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, khachhang.getMa());
            ps.setObject(2, khachhang.getTen());
            ps.setObject(3, khachhang.getTendem());
            ps.setObject(4, khachhang.getHo());
            ps.setObject(5, khachhang.getNgaysinh());
            ps.setObject(6, khachhang.getSdt());
            ps.setObject(7, khachhang.getDiachi());
            ps.setObject(8, khachhang.getThanhpho());
            ps.setObject(9, khachhang.getQuocgia());
            ps.setObject(10, khachhang.getMatkhau());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, KhachHang khachhang) {
        int check = 0;
        String sql = "UPDATE KHACHHANG SET MA = ?, TEN = ? ,TENDEM = ?,HO = ?, NGAYSINH = ?,SDT = ?,DIACHI = ?,THANHPHO = ? ,QUOCGIA = ?,MATKHAU = ? WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, khachhang.getMa());
            ps.setObject(2, khachhang.getTen());
            ps.setObject(3, khachhang.getTendem());
            ps.setObject(4, khachhang.getHo());
            ps.setObject(5, khachhang.getNgaysinh());
            ps.setObject(6, khachhang.getSdt());
            ps.setObject(7, khachhang.getDiachi());
            ps.setObject(8, khachhang.getThanhpho());
            ps.setObject(9, khachhang.getQuocgia());
            ps.setObject(10, khachhang.getMatkhau());
            ps.setObject(11, id);

            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE FROM KHACHHANG WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
