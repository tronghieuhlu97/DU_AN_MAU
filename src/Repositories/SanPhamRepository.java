/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.DongSP;
import DomainModel.NSX;
import DomainModel.SanPham;
import DomainModel.SanPham;
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
public class SanPhamRepository implements ISanPhamRepository {

    @Override
    public List<SanPham> getAll() {
        String query = "SELECT ID,MA,TEN FROM SanPham";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<SanPham> lstSanPham = new ArrayList<>();
            while (rs.next()) {
                SanPham sanpham = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3));
                lstSanPham.add(sanpham);
            }
            return lstSanPham;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public SanPham getSanPhamById(String id) {
        String query = "SELECT ID,MA, TEN FROM SANPHAM WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                SanPham sanpham = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3));
                return sanpham;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(SanPham sanPham) {
        int check = 0;
        String sql = "INSERT INTO SANPHAM(MA,TEN) VALUES(?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, sanPham.getMa());
            ps.setObject(2, sanPham.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, SanPham sanPham) {
        int check = 0;
        String sql = "UPDATE SANPHAM SET MA = ?, TEN = ? WHERE ID = ?";

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, sanPham.getMa());
            ps.setObject(2, sanPham.getTen());
            ps.setObject(3, id);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE FROM SANPHAM WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public SanPham getByTen(String ten) {
        String query = "SELECT * FROM SANPHAM WHERE TEN = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            SanPham sp = new SanPham();

            if (rs.next()) {
                sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3));
            }
            return sp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
