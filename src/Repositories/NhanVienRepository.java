/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.MauSac;
import DomainModel.NhanVien;
import Utilities.DBConnection;
import ViewModels.QLNv;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class NhanVienRepository implements INhanVienRepository {

    @Override
    public List<NhanVien> getAll() {
        String query = "SELECT * FROM NHANVIEN";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<NhanVien> lstNV = new ArrayList<>();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getInt(14));
                lstNV.add(nv);
            }
            return lstNV;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public NhanVien getById(String id) {
        String query = "SELECT * FROM NHANVIEN WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getInt(14));
                return nv;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(NhanVien nv) {
        int check = 0;
        String sql = "INSERT INTO NHANVIEN(MA,TEN,TENDEM,HO,GIOITINH,NGAYSINH,DIACHI,SDT,MATKHAU,IDCH,IDCV,TRANGTHAI) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getTendem());
            ps.setObject(4, nv.getHo());
            ps.setObject(5, nv.getGioitinh());
            ps.setObject(6, nv.getNgaysinh());
            ps.setObject(7, nv.getDiachi());
            ps.setObject(8, nv.getSdt());
            ps.setObject(9, nv.getMatkhau());
            ps.setObject(10, nv.getIdch());
            ps.setObject(11, nv.getIdcv());
            ps.setObject(12, nv.getTrangthai());

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, NhanVien nv) {
 int check = 0;
        String sql = "UPDATE NHANVIEN SET MA = ? ,TEN = ?,TENDEM = ? ,HO = ?,GIOITINH = ? ,NGAYSINH = ? ,DIACHI = ?,SDT = ?,MATKHAU = ? ,IDCH = ? ,IDCV = ?,TRANGTHAI = ? WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getTendem());
            ps.setObject(4, nv.getHo());
            ps.setObject(5, nv.getGioitinh());
            ps.setObject(6, nv.getNgaysinh());
            ps.setObject(7, nv.getDiachi());
            ps.setObject(8, nv.getSdt());
            ps.setObject(9, nv.getMatkhau());
            ps.setObject(10, nv.getIdch());
            ps.setObject(11, nv.getIdcv());
            ps.setObject(12, nv.getTrangthai());
            ps.setObject(13, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
  int check = 0;
        String sql = "DELETE FROM NHANVIEN WHERE ID = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

//    @Override
//    public List<QLNv> getAll() {
//        String query = "SELECT dbo.NhanVien.Id, dbo.NhanVien.Ma, dbo.NhanVien.Ten, dbo.NhanVien.TenDem, dbo.NhanVien.Ho, dbo.NhanVien.GioiTinh, dbo.NhanVien.NgaySinh, dbo.NhanVien.DiaChi, dbo.NhanVien.Sdt, dbo.NhanVien.MatKhau, \n"
//                + "                         dbo.CuaHang.Ten AS Expr1, dbo.ChucVu.Ten AS Expr2, dbo.NhanVien.TrangThai\n"
//                + "FROM            dbo.ChucVu INNER JOIN\n"
//                + "                         dbo.NhanVien ON dbo.ChucVu.Id = dbo.NhanVien.IdCV INNER JOIN\n"
//                + "                         dbo.CuaHang ON dbo.NhanVien.IdCH = dbo.CuaHang.Id";
//        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
//            ResultSet rs = ps.executeQuery();
//            List<QLNv> lstQLNV = new ArrayList<>();
//            while (rs.next()) {
//                QLNv qlnv = new QLNv(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13));
//                lstQLNV.add(qlnv);
//            }
//            return lstQLNV;
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return null;
//    }
//
//    @Override
//    public NhanVien getById(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean add(NhanVien nv) {
//        int check = 0;
//        String sql = "INSERT INTO NHANVIEN(MA,TEN,TENDEM,HO,GIOITINH,NGAYSINH,DIACHI,SDT,MATKHAU,IDCH,IDCV,TRANGTHAI) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
//        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
//            ps.setObject(1, nv.getMa());
//            ps.setObject(2, nv.getTen());
//            ps.setObject(3, nv.getTendem());
//            ps.setObject(4, nv.getHo());
//            ps.setObject(5, nv.getGioitinh());
//            ps.setObject(6, nv.getNgaysinh());
//            ps.setObject(7, nv.getDiachi());
//            ps.setObject(8, nv.getSdt());
//            ps.setObject(9, nv.getMatkhau());
//            ps.setObject(10, nv.getIdch());
//            ps.setObject(11, nv.getIdcv());
//            //ps.setObject(12, nv.getIdguibc());
//            ps.setObject(12, nv.getTrangthai());
//
//            check = ps.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return check > 0;
//    }
//
//    @Override
//    public boolean update(String id, NhanVien nv) {
//        int check = 0;
//        String sql = "UPDATE NHANVIEN SET MA = ? ,TEN = ?,TENDEM = ? ,HO = ?,GIOITINH = ? ,NGAYSINH = ? ,DIACHI = ?,SDT = ?,MATKHAU = ? ,IDCH = ? ,IDCV = ?,TRANGTHAI = ? WHERE ID = ?";
//        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
//            ps.setObject(1, nv.getMa());
//            ps.setObject(2, nv.getTen());
//            ps.setObject(3, nv.getTendem());
//            ps.setObject(4, nv.getHo());
//            ps.setObject(5, nv.getGioitinh());
//            ps.setObject(6, nv.getNgaysinh());
//            ps.setObject(7, nv.getDiachi());
//            ps.setObject(8, nv.getSdt());
//            ps.setObject(9, nv.getMatkhau());
//            ps.setObject(10, nv.getIdch());
//            ps.setObject(11, nv.getIdcv());
//           // ps.setObject(12, nv.getIdguibc());
//            ps.setObject(12, nv.getTrangthai());
//            ps.setObject(13, nv.getId());
//            check = ps.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return check > 0;
//    }
//
//    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = format.parse(txtNS.getText());
    
//    @Override
//    public boolean delete(String id) {
//        int check = 0;
//        String sql = "DELETE FROM NHANVIEN WHERE ID = ?";
//        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
//            ps.setObject(1, id);
//            check = ps.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return check > 0;
//    }
}
