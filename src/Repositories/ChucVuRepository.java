/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.ChucVu;
import DomainModel.DongSP;
import DomainModel.NSX;
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
public class ChucVuRepository implements IChucVuRepository {

    @Override
    public List<ChucVu> getAll() {
        String query = "SELECT * FROM CHUCVU";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<ChucVu> lstChucVu = new ArrayList<>();
            while (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3));
                lstChucVu.add(cv);
            }
            return lstChucVu;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public ChucVu getById(String id) {
        String query = "SELECT ID,MA, TEN FROM CHUCVU WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3));
                return cv;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;

    }

    @Override
    public boolean add(ChucVu chucvu) {
        int check = 0;
        String sql = "INSERT INTO ChucVu(MA,TEN) VALUES(?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, chucvu.getMa());
            ps.setObject(2, chucvu.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, ChucVu chucvu) {
        int check = 0;
        String sql = "UPDATE CHUCVU SET MA = ?, TEN = ? WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, chucvu.getMa());
            ps.setObject(2, chucvu.getTen());
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
        String sql = "DELETE FROM CHUCVU WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public ChucVu getByTen(String ten) {
        String query = "SELECT * FROM CHUCVU WHERE TEN = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            ChucVu cv = new ChucVu();

            if (rs.next()) {
                cv = new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3));
            }
            return cv;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
