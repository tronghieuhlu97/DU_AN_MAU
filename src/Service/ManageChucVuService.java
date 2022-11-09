/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.ChucVu;
import DomainModel.NSX;
import Repositories.ChucVuRepository;
import Repositories.IChucVuRepository;
import ViewModels.QLChucVu;
import ViewModels.QLNSX;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class ManageChucVuService implements IManageChucVuService {

    IChucVuRepository _iChucVuRepository = new ChucVuRepository();

//    @Override
//    public List<ChucVu> getAll() {
//        return _iChucVuRepository.getAll();
//    }
//
//    @Override
//    public ChucVu getById(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String add(ChucVu chucvu) {
//        return _iChucVuRepository.add(chucvu) ? "Thêm thành công" : "Thêm thất bại";
//    }
//
//    @Override
//    public String update(String id, ChucVu chucvu) {
//        return _iChucVuRepository.update(id, chucvu) ? "Sửa thành công" : "Sửa thất bại";
//    }
//
//    @Override
//    public String delete(String id) {
//        return _iChucVuRepository.delete(id) ? "Xóa thành công" : "Xóa thất bại";
//    }
    @Override
    public List<QLChucVu> getAll() {

        List<ChucVu> lstCV = _iChucVuRepository.getAll();
        List<QLChucVu> lstqlcv = new ArrayList<>();
        for (ChucVu x : lstCV) {
            QLChucVu qlcv = new QLChucVu();
            qlcv.setId(x.getId());
            qlcv.setMa(x.getMa());
            qlcv.setTen(x.getTen());
            lstqlcv.add(qlcv);
        }
        return lstqlcv;

    }

    @Override
    public QLChucVu getById(String id) {
        ChucVu cv = _iChucVuRepository.getById(id);
        QLChucVu qlcv = new QLChucVu();
        qlcv.setId(cv.getId());
        qlcv.setMa(cv.getMa());
        qlcv.setTen(cv.getTen());
        return qlcv;
    }

    @Override
    public String add(QLChucVu qlcv) {
        ChucVu cv = new ChucVu();
        cv.setId(qlcv.getId());
        cv.setMa(qlcv.getMa());
        cv.setTen(qlcv.getTen());
        return _iChucVuRepository.add(cv) ? "Thêm thành công" : "Thêm thất bại";
    }

    @Override
    public String update(String id, QLChucVu qlcv) {
        ChucVu cv = new ChucVu();
        cv.setId(qlcv.getId());
        cv.setMa(qlcv.getMa());
        cv.setTen(qlcv.getTen());
        return _iChucVuRepository.update(id, cv) ? "Sửa thành công" : "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        return _iChucVuRepository.delete(id) ? "Xóa thành công" : "Xóa thất bại";
    }

}
