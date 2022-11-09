/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.CuaHang;
import DomainModel.DongSP;
import Utilities.DBConnection;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Trong Hieu
 */
public class CuaHangRepository implements ICuaHangRepository {

    @Override
    public List<CuaHang> getAll() {
        String sql = "SELECT * FROM CUAHANG";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<CuaHang> lstCuaHang = new ArrayList<>();
            while (rs.next()) {
                CuaHang cuahang = new CuaHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                lstCuaHang.add(cuahang);
            }
            return lstCuaHang;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public CuaHang getById(String id) {
        String query = "SELECT * FROM CUAHANG WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
          CuaHang ch = new CuaHang();

            if (rs.next()) {
                ch = new CuaHang(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
            }
            return ch;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(CuaHang cuahang) {
        int check = 0;
        String sql = "INSERT INTO CuaHang(MA,TEN,DIACHI,THANHPHO,QUOCGIA) VALUES(?,?,?,?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, cuahang.getMa());
            ps.setObject(2, cuahang.getTen());
            ps.setObject(3, cuahang.getDiachi());
            ps.setObject(4, cuahang.getThanhpho());
            ps.setObject(5, cuahang.getQuocgia());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, CuaHang cuahang) {
        int check = 0;
        String sql = "UPDATE CuaHang SET Ma = ?, TEN = ?, DiaChi = ?, ThanhPho = ?, QuocGia = ? WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, cuahang.getMa());
            ps.setObject(2, cuahang.getTen());
            ps.setObject(3, cuahang.getDiachi());
            ps.setObject(4, cuahang.getThanhpho());
            ps.setObject(5, cuahang.getQuocgia());
            ps.setObject(6, id);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE FROM CUAHANG WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
