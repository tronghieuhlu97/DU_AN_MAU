/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.DongSP;
import DomainModel.HoaDonChiTiet;
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
public class HDCTRepository implements IHoaDonChiTietRepository {

//    @Override
//    public List<HoaDonChiTiet> getAll() {
//        String query = "SELECT * FROM HOADONCHITIET";
//        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
//            ResultSet rs = ps.executeQuery();
//            List<HoaDonChiTiet> lstHDCT = new ArrayList<>();
//            while (rs.next()) {
//                HoaDonChiTiet hdct = new HoaDonChiTiet(rs.getString(1), rs.getString(2), rs.getInt(3),rs.getFloat(4));
//                lstHDCT.add(hdct);
//            }
//            return lstHDCT;
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return null;
//    }
//
//    @Override
//    public HoaDonChiTiet getHDCTById(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean add(HoaDonChiTiet hdct) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean update(String id, HoaDonChiTiet hdct) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean delete(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
