/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.KhachHang;
import Repositories.IKhachHangRepository;
import Repositories.KhachHangRepository;
import ViewModels.QLKhachHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class ManageKhachHangService implements IManageKhachHangService {

    IKhachHangRepository _iKhachHangRepository = new KhachHangRepository();


    @Override
    public List<QLKhachHang> getAll() {
        List<KhachHang> lstkh = _iKhachHangRepository.getAll();
        List<QLKhachHang> lstqlkh = new ArrayList<>();
        for (KhachHang x : lstkh) {
            QLKhachHang qlkh = new QLKhachHang();
            qlkh.setId(x.getId());
            qlkh.setMa(x.getMa());
            qlkh.setTen(x.getTen());
            qlkh.setTendem(x.getTendem());
            qlkh.setHo(x.getHo());
            qlkh.setNgaysinh(x.getNgaysinh());
            qlkh.setSdt(x.getSdt());
            qlkh.setDiachi(x.getDiachi());
            qlkh.setThanhpho(x.getThanhpho());
            qlkh.setQuocgia(x.getQuocgia());
            qlkh.setMatkhau(x.getMatkhau());
            lstqlkh.add(qlkh);
        }
        return lstqlkh;
    }

    @Override
    public QLKhachHang getById(String id) {
        KhachHang x = _iKhachHangRepository.getKHById(id);
        QLKhachHang qlkh = new QLKhachHang();
        qlkh.setId(x.getId());
        qlkh.setMa(x.getMa());
        qlkh.setTen(x.getTen());
        qlkh.setTendem(x.getTendem());
        qlkh.setHo(x.getHo());
        qlkh.setNgaysinh(x.getNgaysinh());
        qlkh.setSdt(x.getSdt());
        qlkh.setDiachi(x.getDiachi());
        qlkh.setThanhpho(x.getThanhpho());
        qlkh.setQuocgia(x.getQuocgia());
        qlkh.setMatkhau(x.getMatkhau());
        return qlkh;
    }

    @Override
    public String add(QLKhachHang qlkhachhang) {
        KhachHang kh = new KhachHang();

        kh.setId(qlkhachhang.getId());
        kh.setMa(qlkhachhang.getMa());
        kh.setTen(qlkhachhang.getTen());
        kh.setTendem(qlkhachhang.getTendem());
        kh.setHo(qlkhachhang.getHo());
        kh.setNgaysinh(qlkhachhang.getNgaysinh());
        kh.setSdt(qlkhachhang.getSdt());
        kh.setDiachi(qlkhachhang.getDiachi());
        kh.setThanhpho(qlkhachhang.getThanhpho());
        kh.setQuocgia(qlkhachhang.getQuocgia());
        kh.setMatkhau(qlkhachhang.getMatkhau());
        return _iKhachHangRepository.add(kh) ? "Thêm thành công" : "Thêm thất bại";
    }

    @Override
    public String update(String id, QLKhachHang qlkhachhang) {
        KhachHang kh = new KhachHang();
        kh.setId(qlkhachhang.getId());
        kh.setMa(qlkhachhang.getMa());
        kh.setTen(qlkhachhang.getTen());
        kh.setTendem(qlkhachhang.getTendem());
        kh.setHo(qlkhachhang.getHo());
        kh.setNgaysinh(qlkhachhang.getNgaysinh());
        kh.setSdt(qlkhachhang.getSdt());
        kh.setDiachi(qlkhachhang.getDiachi());
        kh.setThanhpho(qlkhachhang.getThanhpho());
        kh.setQuocgia(qlkhachhang.getQuocgia());
        kh.setMatkhau(qlkhachhang.getMatkhau());
        return _iKhachHangRepository.update(id, kh) ? "Sửa thành công" : "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        return _iKhachHangRepository.delete(id) ? "Xóa thành công" : "Xóa thất bại";
    }

}
