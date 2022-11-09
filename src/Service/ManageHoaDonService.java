/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.HoaDon;
import Repositories.HoaDonRepository;
import Repositories.IHoaDonRepository;
import ViewModels.QLhd;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class ManageHoaDonService implements IManageHoaDonService {

    IHoaDonRepository _iHoaDonRepository = new HoaDonRepository();
//
//    @Override
//    public List<HoaDon> getAll() {
//        return _iHoaDonRepository.getAll();
//
//    }
//
//    @Override
//    public HoaDon getHdById(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String add(HoaDon hd) {
//        return _iHoaDonRepository.Add(hd) ? "Thêm thành công" : "Thêm thất bại";
//
//    }
//
//    @Override
//    public String edit(String id, HoaDon hd) {
//        return _iHoaDonRepository.Update(id, hd) ? "Sửa thành công" : "Sửa thất bại";
//
//    }
//
//    @Override
//    public String delete(String id) {
//        return _iHoaDonRepository.Delete(id) ? "Xóa thành công" : "Xóa thất bại";
//
//    }

    @Override
    public List<QLhd> getAll() {
        List<HoaDon> lstHD = _iHoaDonRepository.getAll();
        List<QLhd> lstqlhd = new ArrayList<>();
        for (HoaDon x : lstHD) {
            QLhd qlhd = new QLhd();
            qlhd.setId(x.getId());
            qlhd.setIdkh(x.getIdkh());
            qlhd.setIdnv(x.getIdnv());
            qlhd.setMa(x.getMa());
            qlhd.setNgaytao(x.getNgaytao());
            qlhd.setNgaythanhtoan(x.getNgaythanhtoan());
            qlhd.setNgayship(x.getNgayship());
            qlhd.setNgaynhan(x.getNgaynhan());
            qlhd.setTinhtrang(x.getTinhtrang());
            qlhd.setTennguoinhan(x.getTennguoinhan());
            qlhd.setDiachi(x.getDiachi());
            qlhd.setSdt(x.getSdt());
            lstqlhd.add(qlhd);
        }
        return lstqlhd;
    }

    @Override
    public QLhd getHdById(String id) {
        HoaDon x = _iHoaDonRepository.getById(id);
        QLhd qlhd = new QLhd();
        qlhd.setId(x.getId());
        qlhd.setIdkh(x.getIdkh());
        qlhd.setIdnv(x.getIdnv());
        qlhd.setMa(x.getMa());
        qlhd.setNgaytao(x.getNgaytao());
        qlhd.setNgaythanhtoan(x.getNgaythanhtoan());
        qlhd.setNgayship(x.getNgayship());
        qlhd.setNgaynhan(x.getNgaynhan());
        qlhd.setTinhtrang(x.getTinhtrang());
        qlhd.setTennguoinhan(x.getTennguoinhan());
        qlhd.setDiachi(x.getDiachi());
        qlhd.setSdt(x.getSdt());
        return qlhd;
    }

    @Override
    public String add(QLhd qlhd) {
        HoaDon hd = new HoaDon();

        hd.setId(qlhd.getId());
        hd.setIdkh(qlhd.getIdkh());
        hd.setIdnv(qlhd.getIdnv());
        hd.setMa(qlhd.getMa());
        hd.setNgaytao(qlhd.getNgaytao());
        hd.setNgaythanhtoan(qlhd.getNgaythanhtoan());
        hd.setNgayship(qlhd.getNgayship());
        hd.setNgaynhan(qlhd.getNgaynhan());
        hd.setTinhtrang(qlhd.getTinhtrang());
        hd.setTennguoinhan(qlhd.getTennguoinhan());
        hd.setDiachi(qlhd.getDiachi());
        hd.setSdt(qlhd.getSdt());
        return _iHoaDonRepository.Add(hd) ? "Thêm thành công" : "Thêm thất bại";
    }

    @Override
    public String edit(String id, QLhd qlhd) {
        HoaDon hd = new HoaDon();

        hd.setId(qlhd.getId());
        hd.setIdkh(qlhd.getIdkh());
        hd.setIdnv(qlhd.getIdnv());
        hd.setMa(qlhd.getMa());
        hd.setNgaytao(qlhd.getNgaytao());
        hd.setNgaythanhtoan(qlhd.getNgaythanhtoan());
        hd.setNgayship(qlhd.getNgayship());
        hd.setNgaynhan(qlhd.getNgaynhan());
        hd.setTinhtrang(qlhd.getTinhtrang());
        hd.setTennguoinhan(qlhd.getTennguoinhan());
        hd.setDiachi(qlhd.getDiachi());
        hd.setSdt(qlhd.getSdt());
        return _iHoaDonRepository.Update(id, hd)?"Sửa thành công":"Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        return _iHoaDonRepository.Delete(id)?"Xóa thành công":"Xóa thất bại";
    }

}
