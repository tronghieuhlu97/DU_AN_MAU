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
public class DongSPRepository implements IDongSPRepository {

    @Override
    public List<DongSP> getAll() {
        String query = "SELECT * FROM DONGSP";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<DongSP> lstDongSP = new ArrayList<>();
            while (rs.next()) {
                DongSP dongsp = new DongSP(rs.getString(1), rs.getString(2), rs.getString(3));
                lstDongSP.add(dongsp);
            }
            return lstDongSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public DongSP getDongSPById(String id) {
        String query = "SELECT * FROM DONGSP WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            DongSP dongsp = new DongSP();

            if (rs.next()) {
                dongsp = new DongSP(rs.getString(1), rs.getString(2), rs.getString(3));
            }
            return dongsp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(DongSP dongsp) {
        int check = 0;
        String sql = "INSERT INTO DONGSP(MA,TEN) VALUES(?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, dongsp.getMa());
            ps.setObject(2, dongsp.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, DongSP dongsp) {
        int check = 0;
        String sql = "UPDATE DONGSP SET MA = ?, TEN = ? WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, dongsp.getMa());
            ps.setObject(2, dongsp.getTen());
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
        String sql = "DELETE FROM DONGSP WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        DongSPRepository dsp = new DongSPRepository();
        DongSP dsp1 = dsp.getDongSPById("60983D52-3EC4-44E3-8B45-3BC327699A78");
//        for (DongSP dongSP : lst) {
//            System.out.println(dongSP.toString());
//        }
        System.out.println(dsp1.toString());
    }

    @Override
    public DongSP getDSPByTen(String ten) {
        String query = "SELECT * FROM DONGSP WHERE TEN = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            DongSP dongsp = new DongSP();

            if (rs.next()) {
                dongsp = new DongSP(rs.getString(1), rs.getString(2), rs.getString(3));
            }
            return dongsp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
