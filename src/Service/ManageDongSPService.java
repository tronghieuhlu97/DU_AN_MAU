/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.DongSP;
import Repositories.DongSPRepository;
import Repositories.IDongSPRepository;
import ViewModels.QLDongSP;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class ManageDongSPService implements IManageDongSPService {

    IDongSPRepository _iDongSPRepository = new DongSPRepository();

    @Override
    public List<QLDongSP> getAll() {
        List<DongSP> lstDongSP = new ArrayList<>();
        lstDongSP = _iDongSPRepository.getAll();
        List<QLDongSP> lstqldongsp = new ArrayList<>();
        QLDongSP qldongsp;
        for (DongSP x : lstDongSP) {
            qldongsp = new QLDongSP();
            qldongsp.setId(x.getId());
            qldongsp.setMa(x.getMa());
            qldongsp.setTen(x.getTen());
            lstqldongsp.add(qldongsp);
        }
        return lstqldongsp;
    }

    @Override
    public QLDongSP getById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(QLDongSP qldongsp) {
        DongSP dongsp = new DongSP();
        dongsp.setMa(qldongsp.getMa());
        dongsp.setTen(qldongsp.getTen());
        return _iDongSPRepository.add(dongsp) ? "Thêm thành công" : "Thêm thất bại";
    }

    @Override
    public String update(String id, QLDongSP qldongsp) {
        DongSP dongsp = new DongSP();
        dongsp.setMa(qldongsp.getMa());
        dongsp.setTen(qldongsp.getTen());
        dongsp.setId(qldongsp.getId());
        return _iDongSPRepository.update(id, dongsp) ? "Sửa thành công" : "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        return _iDongSPRepository.delete(id) ? "Xóa thành công" : "Xóa thất bại";
    }

}
