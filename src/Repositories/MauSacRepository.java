/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.DongSP;
import DomainModel.MauSac;
import Utilities.DBConnection;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Trong Hieu
 */
public class MauSacRepository implements IMauSacRepository {

    @Override
    public List<MauSac> getAll() {
        String query = "SELECT ID,MA,TEN FROM MauSac";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<MauSac> lstMauSac = new ArrayList<>();
            while (rs.next()) {
                MauSac mausac = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                lstMauSac.add(mausac);
            }
            return lstMauSac;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public MauSac getById(String id) {
        String query = "SELECT ID, MA,TEN FROM MauSac WHERE ID = ?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                MauSac mauSac = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                return mauSac;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(MauSac mauSac) {
        int check = 0;
        String sql = "INSERT INTO MAUSAC(MA,TEN) VALUES(?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, mauSac.getMa());
            ps.setObject(2, mauSac.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, MauSac mauSac) {
        int check = 0;
        String sql = "UPDATE MAUSAC SET MA = ?, TEN = ? WHERE ID = ?";

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, mauSac.getMa());
            ps.setObject(2, mauSac.getTen());
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
        String sql = "DELETE FROM MAUSAC WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public MauSac getByTen(String ten) {
        String query = "SELECT * FROM MAUSAC WHERE TEN = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            MauSac mausac = new MauSac();

            if (rs.next()) {
                mausac = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
            }
            return mausac;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<MauSac> lst = new ArrayList<>();
        MauSacRepository mana = new MauSacRepository();
        MauSac mauSac = mana.getByTen("Màu đỏ");
      
            System.out.println(mauSac.toString());
        
    }

}
