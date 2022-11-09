/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.CuaHang;
import Repositories.CuaHangRepository;
import Repositories.ICuaHangRepository;
import ViewModels.QLCuaHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class ManageCuaHangService implements IManageCuaHangService {

    ICuaHangRepository _iCuaHangRepository = new CuaHangRepository();
//    @Override
//    public List<CuaHang> getAll() {
//        return _iCuaHangRepository.getAll();
//    }
//
//    @Override
//    public CuaHang getById(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String add(CuaHang cuahang) {
//        return  _iCuaHangRepository.add(cuahang)?"Thêm thành công":"Thêm thất bại";
//    }
//
//    @Override
//    public String update(String id, CuaHang cuahang) {
//        return _iCuaHangRepository.update(id, cuahang)?"Sửa thành công":"Sửa thất bại";
//    }
//
//    @Override
//    public String delete(String id) {
//        return _iCuaHangRepository.delete(id)?"Xóa thành công":"Xóa thất bại";
//    }

    @Override
    public List<QLCuaHang> getAll() {
        List<CuaHang> lstCH = _iCuaHangRepository.getAll();
        List<QLCuaHang> lstqlch = new ArrayList<>();
        for (CuaHang x : lstCH) {
            QLCuaHang qlch = new QLCuaHang();
            qlch.setId(x.getId());
            qlch.setMa(x.getMa());
            qlch.setTen(x.getTen());
            qlch.setDiachi(x.getDiachi());
            qlch.setThanhpho(x.getThanhpho());
            qlch.setQuocgia(x.getQuocgia());
            lstqlch.add(qlch);

        }
        return lstqlch;
    }

    @Override
    public QLCuaHang getById(String id) {
        CuaHang ch = _iCuaHangRepository.getById(id);
        QLCuaHang qlch = new QLCuaHang();
        qlch.setId(ch.getId());
        qlch.setMa(ch.getMa());
        qlch.setTen(ch.getTen());
        qlch.setDiachi(ch.getDiachi());
        qlch.setThanhpho(ch.getThanhpho());
        qlch.setQuocgia(ch.getQuocgia());

        return qlch;
    }

    @Override
    public String add(QLCuaHang qlcuahang) {
        CuaHang ch = new CuaHang();
        ch.setId(qlcuahang.getId());
        ch.setMa(qlcuahang.getMa());
        ch.setTen(qlcuahang.getTen());
        ch.setDiachi(qlcuahang.getDiachi());
        ch.setThanhpho(qlcuahang.getThanhpho());
        ch.setQuocgia(qlcuahang.getQuocgia());
        return _iCuaHangRepository.add(ch) ? "Them thanh cong" : "Them that bai";

    }

    @Override
    public String update(String id, QLCuaHang qlcuahang) {
        CuaHang ch = new CuaHang();
        ch.setId(qlcuahang.getId());
        ch.setMa(qlcuahang.getMa());
        ch.setTen(qlcuahang.getTen());
        ch.setDiachi(qlcuahang.getDiachi());
        ch.setThanhpho(qlcuahang.getThanhpho());
        ch.setQuocgia(qlcuahang.getQuocgia());
        
        return _iCuaHangRepository.update(id, ch)?"Sua thanh cong":"Sua that bai";
    }

    @Override
    public String delete(String id) {
        return _iCuaHangRepository.delete(id)?"Xoa thanh cong":"Xoa that bai";
    }

    public static void main(String[] args) {
        ManageCuaHangService ma = new ManageCuaHangService();
        List<QLCuaHang> lst = ma.getAll();
        for (QLCuaHang qLCuaHang : lst) {
            System.out.println(qLCuaHang.toString());
        }
    }
}
