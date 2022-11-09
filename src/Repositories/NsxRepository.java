/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.DongSP;
import DomainModel.NSX;
import Utilities.DBConnection;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Trong Hieu
 */
public class NsxRepository implements INsxRepository {

    @Override
    public List<NSX> getAll() {
        String query = "SELECT ID, MA, TEN FROM NSX";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<NSX> lstNsx = new ArrayList<>();
            while (rs.next()) {
                NSX nsx = new NSX(rs.getString(1), rs.getString(2), rs.getString(3));
                lstNsx.add(nsx);
            }
            return lstNsx;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public NSX getNsxById(String id) {
        String query = "SELECT ID,MA, TEN FROM NSX WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                NSX nsx = new NSX(rs.getString(1), rs.getString(2), rs.getString(3));
                return nsx;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(NSX nsx) {
        int check = 0;
        String query = "INSERT INTO NSX(MA,TEN) VALUES(?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, nsx.getMa());
            ps.setObject(2, nsx.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean edit(String id, NSX nsx) {
        int check = 0;
        String sql = "UPDATE NSX SET MA = ?, TEN = ? WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, nsx.getMa());
            ps.setObject(2, nsx.getTen());
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
        String sql = "DELETE FROM NSX WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public NSX getByTen(String ten) {
        String query = "SELECT * FROM NSX WHERE TEN = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            NSX nsx = new NSX();

            if (rs.next()) {
                nsx = new NSX(rs.getString(1), rs.getString(2), rs.getString(3));
            }
            return nsx;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
