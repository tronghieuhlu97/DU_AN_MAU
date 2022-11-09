/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.NSX;
import Repositories.INsxRepository;
import Repositories.NsxRepository;
import ViewModels.QLNSX;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class ManageNsxService implements IManageNsxService {

    private INsxRepository _iNsxRepository = new NsxRepository();

    @Override
    public List<QLNSX> getAll() {
        List<NSX> lstNSX = _iNsxRepository.getAll();
        List<QLNSX> lstQlnsxs = new ArrayList<>();
        for (NSX x : lstNSX) {
            QLNSX qlnsx = new QLNSX();
            qlnsx.setId(x.getId());
            qlnsx.setMa(x.getMa());
            qlnsx.setTen(x.getTen());
            lstQlnsxs.add(qlnsx);
        }
        return lstQlnsxs;
    }

    @Override
    public QLNSX getNsxById(String id) {
        NSX nsx = _iNsxRepository.getNsxById(id);
        QLNSX qlnsx = new QLNSX();
        qlnsx.setId(nsx.getId());
        qlnsx.setMa(nsx.getMa());
        qlnsx.setTen(nsx.getTen());
        return qlnsx;
    }

    @Override
    public String add(QLNSX qlnsx) {
        NSX nsx = new NSX();
        nsx.setId(qlnsx.getId());
        nsx.setMa(qlnsx.getMa());
        nsx.setTen(qlnsx.getTen());
        return _iNsxRepository.add(nsx) ? "Thêm thành công" : "Thêm thất bại";
    }

    @Override
    public String edit(String id, QLNSX qlnsx) {
        NSX nsx = new NSX();
        nsx.setId(qlnsx.getId());
        nsx.setMa(qlnsx.getMa());
        nsx.setTen(qlnsx.getTen());
        return _iNsxRepository.edit(id, nsx) ? "Sửa thành công" : "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        return _iNsxRepository.delete(id) ? "Xóa thành công" : "Xóa thất bại";
    }

}
