/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.SanPham;
import Repositories.ISanPhamRepository;
import Repositories.SanPhamRepository;
import ViewModels.QLSP;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class ManageSanPhamService implements IManageSanPhamService {

    private ISanPhamRepository _iSanPhamRepository = new SanPhamRepository();

    @Override
    public List<QLSP> getAll() {
        List<SanPham> lstsp = _iSanPhamRepository.getAll();
        List<QLSP> lstQLSP = new ArrayList<>();
        for (SanPham sanPham : lstsp) {
            QLSP qlsp = new QLSP();
            qlsp.setId(sanPham.getId());
            qlsp.setMa(sanPham.getMa());
            qlsp.setTen(sanPham.getTen());
            lstQLSP.add(qlsp);
        }
        return lstQLSP;
    }

    @Override
    public String add(QLSP qlsp) {
        SanPham sp = new SanPham();
        sp.setId(qlsp.getId());
        sp.setMa(qlsp.getMa());
        sp.setTen(qlsp.getTen());
        return _iSanPhamRepository.add(sp)?"Thêm thành công":"Thêm thất bại";
    }

    @Override
    public String edit(String id, QLSP qlsp) {
        SanPham sp = new SanPham();
        sp.setId(qlsp.getId());
        sp.setMa(qlsp.getMa());
        sp.setTen(qlsp.getTen());
        return _iSanPhamRepository.update(id, sp)?"Sửa thành công":"Sửa thất bại";
    }

    @Override
    public String delete(String id) {
       return _iSanPhamRepository.delete(id)?"Xóa thành công":"Xóa thất bại";
    }

    @Override
    public QLSP getSPById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
