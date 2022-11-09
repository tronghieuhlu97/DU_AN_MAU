/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.ChiTietSP;
import DomainModel.DongSP;
import Utilities.DBConnection;
import ViewModels.QLCtsp;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Trong Hieu
 */
public class ChiTietSanPhamRepository implements IChiTietSPRepository {

    IDongSPRepository _iDongSPRepository;
    IMauSacRepository _iMauSacRepository;
    ISanPhamRepository _iSanPhamRepository;
    INsxRepository _iNsxRepository;

    public ChiTietSanPhamRepository() {
        _iDongSPRepository = new DongSPRepository();
        _iMauSacRepository = new MauSacRepository();
        _iSanPhamRepository = new SanPhamRepository();
        _iNsxRepository = new NsxRepository();
    }

    @Override
    public List<ChiTietSP> getAll() {
        String query = "SELECT * FROM CHITIETSP";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietSP> lstChiTietSP = new ArrayList<>();
            while (rs.next()) {
                ChiTietSP chiTietSP = new ChiTietSP(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getFloat(9), rs.getFloat(10));
                //QLCtsp qLCtsp = new QLCtsp(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getFloat(9), rs.getFloat(10));
                lstChiTietSP.add(chiTietSP);
            }
            return lstChiTietSP;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public ChiTietSP getById(String id) {
        String query = "SELECT * FROM CHITIETSP WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            ChiTietSP chitietsp = new ChiTietSP();

            if (rs.next()) {
                chitietsp = new ChiTietSP(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getFloat(9), rs.getFloat(10));
            }
            return chitietsp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean Add(ChiTietSP chiTietSP) {
        int check = 0;
        String sql = "INSERT INTO ChiTietSP(IdSP,IdNsx,IdMauSac,IdDongSP,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan) VALUES(?,?,?,?,?,?,?,?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, chiTietSP.getIdsp());
            ps.setObject(2, chiTietSP.getIdnsx());
            ps.setObject(3, chiTietSP.getIdms());
            ps.setObject(4, chiTietSP.getIddsp());
            ps.setObject(5, chiTietSP.getNambh());
            ps.setObject(6, chiTietSP.getMota());
            ps.setObject(7, chiTietSP.getSoluongton());
            ps.setObject(8, chiTietSP.getGianhap());
            ps.setObject(9, chiTietSP.getGiaban());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean Update(String id, ChiTietSP chiTietSP) {
        int check = 0;
        String sql = "UPDATE ChiTietSP SET IdSP = ?,IdNsx = ?,IdMauSac=?,IdDongSP=?,NamBH=?,MoTa=?,SoLuongTon=?,GiaNhap=?,GiaBan = ? WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, chiTietSP.getIdsp());
            ps.setObject(2, chiTietSP.getIdnsx());
            ps.setObject(3, chiTietSP.getIdms());
            ps.setObject(4, chiTietSP.getIddsp());
            ps.setObject(5, chiTietSP.getNambh());
            ps.setObject(6, chiTietSP.getMota());
            ps.setObject(7, chiTietSP.getSoluongton());
            ps.setObject(8, chiTietSP.getGianhap());
            ps.setObject(9, chiTietSP.getGiaban());
            ps.setObject(10, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean Delete(String id) {
        int check = 0;
        String sql = "DELETE FROM CHITIETSP WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        ChiTietSanPhamRepository ctsp = new ChiTietSanPhamRepository();
        List<ChiTietSP> lst = ctsp.getAll();
        IDongSPRepository _iDongSPRepository = new DongSPRepository();
        INsxRepository _iNsxRepository = new NsxRepository();
        IMauSacRepository _iMauSacRepository = new MauSacRepository();
        ISanPhamRepository _iSanPhamRepository = new SanPhamRepository();

        for (ChiTietSP x : lst) {
            //  System.out.println(_iDongSPRepository.getDongSPById(x.getIddsp()).getTen());;
          //   System.out.println(_iNsxRepository.getNsxById(x.getIdnsx()).getTen());
            System.out.println(_iMauSacRepository.getById(x.getIdms()).getTen());
            //System.out.println(_iSanPhamRepository.getSanPhamById(x.getIdsp()).getTen());
           //System.out.println(x.toString());
           // System.out.println(x.toString());
        }
    }
}
