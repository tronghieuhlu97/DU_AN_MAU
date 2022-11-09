/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.NSX;
import DomainModel.NhanVien;
import Repositories.INhanVienRepository;
import Repositories.NhanVienRepository;
import Utilities.DBConnection;
import ViewModels.QLNv;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class ManageNhanVienService implements IManageNhanVienService {

    INhanVienRepository _iNhanVienRepository = new NhanVienRepository();
//
//    @Override
//    public List<QLNv> getAll() {
//        return _iNhanVienRepository.getAll();
//    }
//
//    @Override
//    public NhanVien getNsxById(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String add(QLNv nv) {
//        
////        NhanVien NV1 = new NhanVien();
////        NV1.setId(nv.getId());
////        NV1.setMa(nv.getMa());
//        return _iNhanVienRepository.add(NV1) ? "Thêm thành công" : "Thêm thất bại";
//    }
//
//    @Override
//    public String edit(String id, NhanVien nv) {
//        return _iNhanVienRepository.update(id, nv) ? "Sửa thành công" : "Sửa thất bại";
//
//    }
//
//    @Override
//    public String delete(String id) {
//        return _iNhanVienRepository.delete(id) ? "Xóa thành công" : "Xóa thất bại";
//
//    }

    @Override
    public List<QLNv> getAll() {
        List<QLNv> lstqlnv = new ArrayList<>();
        List<NhanVien> lstnv = _iNhanVienRepository.getAll();
        QLNv qlnv;
        for (NhanVien x : lstnv) {
            qlnv = new QLNv();
            qlnv.setId(x.getId());
            qlnv.setMa(x.getMa());
            qlnv.setTen(x.getTen());
            qlnv.setTendem(x.getTendem());
            qlnv.setHo(x.getHo());
            qlnv.setGioitinh(x.getGioitinh());
            qlnv.setNgaysinh(x.getNgaysinh());
            qlnv.setDiachi(x.getDiachi());
            qlnv.setSdt(x.getSdt());
            qlnv.setMatkhau(x.getMatkhau());
            qlnv.setIdCH(x.getIdch());
            qlnv.setIdCV(x.getIdcv());
            qlnv.setIdGBC(x.getIdguibc());
            qlnv.setTrangthai(x.getTrangthai());
            lstqlnv.add(qlnv);
        }
        return lstqlnv;

    }

    @Override
    public QLNv getNVById(String id) {
        NhanVien x = _iNhanVienRepository.getById(id);
        QLNv qlnv = new QLNv();
        qlnv.setId(x.getId());
        qlnv.setMa(x.getMa());
        qlnv.setTen(x.getTen());
        qlnv.setTendem(x.getTendem());
        qlnv.setHo(x.getHo());
        qlnv.setGioitinh(x.getGioitinh());
        qlnv.setNgaysinh(x.getNgaysinh());
        qlnv.setDiachi(x.getDiachi());
        qlnv.setSdt(x.getSdt());
        qlnv.setMatkhau(x.getMatkhau());
        qlnv.setIdCH(x.getIdch());
        qlnv.setIdCV(x.getIdcv());
        qlnv.setIdGBC(x.getIdguibc());
        qlnv.setTrangthai(x.getTrangthai());
        return qlnv;
    }

    @Override
    public String add(QLNv qlnv) {
        NhanVien nv = new NhanVien();

        nv.setId(qlnv.getId());
        nv.setMa(qlnv.getMa());
        nv.setTen(qlnv.getTen());
        nv.setTendem(qlnv.getTendem());
        nv.setHo(qlnv.getHo());
        nv.setGioitinh(qlnv.getGioitinh());
        nv.setNgaysinh(qlnv.getNgaysinh());
        nv.setDiachi(qlnv.getDiachi());
        nv.setSdt(qlnv.getSdt());
        nv.setMatkhau(qlnv.getMatkhau());
        nv.setIdch(qlnv.getIdCH());
        nv.setIdcv(qlnv.getIdCV());
        nv.setIdguibc(qlnv.getIdGBC());
        nv.setTrangthai(qlnv.getTrangthai());
        return _iNhanVienRepository.add(nv) ? "Thêm thành công" : "Thêm thất bại";
    }

    @Override
    public String edit(String id, QLNv qlnv) {
        NhanVien nv = new NhanVien();
        nv.setId(qlnv.getId());
        nv.setMa(qlnv.getMa());
        nv.setTen(qlnv.getTen());
        nv.setTendem(qlnv.getTendem());
        nv.setHo(qlnv.getHo());
        nv.setGioitinh(qlnv.getGioitinh());
        nv.setNgaysinh(qlnv.getNgaysinh());
        nv.setDiachi(qlnv.getDiachi());
        nv.setSdt(qlnv.getSdt());
        nv.setMatkhau(qlnv.getMatkhau());
        nv.setIdch(qlnv.getIdCH());
        nv.setIdcv(qlnv.getIdCV());
        nv.setIdguibc(qlnv.getIdGBC());
        nv.setTrangthai(qlnv.getTrangthai());
        return _iNhanVienRepository.update(id, nv)?"Sửa thành công":"Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        return _iNhanVienRepository.delete(id)?"Xóa thành công":"Xóa thất bại";
    }

}
