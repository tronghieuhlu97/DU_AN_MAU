/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.MauSac;
import Repositories.IMauSacRepository;
import Repositories.MauSacRepository;
import ViewModels.QLMauSac;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class ManageMauSacService implements IManageMauSacService {

    private IMauSacRepository _iMauSacRepository = new MauSacRepository();

    @Override
    public List<QLMauSac> getAll() {
        List<QLMauSac> lstqlms = new ArrayList<>();
        List<MauSac> lstms = _iMauSacRepository.getAll();
        QLMauSac qlms;
        for (MauSac x : lstms) {
            qlms = new QLMauSac();
            qlms.setId(x.getId());
            qlms.setMa(x.getMa());
            qlms.setTen(x.getTen());
            lstqlms.add(qlms);
        }
        return lstqlms;
    }

    @Override
    public String add(QLMauSac qlmauSac) {
        MauSac ms = new MauSac();
        ms.setMa(qlmauSac.getMa());
        ms.setTen(qlmauSac.getTen());
        return _iMauSacRepository.add(ms) ? "Thêm thành công" : "Thêm thất bại";
    }

    @Override
    public String update(String id, QLMauSac qlmauSac) {
        MauSac ms = new MauSac();
        ms.setMa(qlmauSac.getMa());
        ms.setTen(qlmauSac.getTen());
        return _iMauSacRepository.update(id, ms) ? "Sửa thành công" : "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        return _iMauSacRepository.delete(id) ? "Xóa thành công" : "Xóa thất bại";
    }

    @Override
    public QLMauSac getById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        ManageMauSacService lst = new  ManageMauSacService();
        List<QLMauSac> lst1 = lst.getAll();
        for (QLMauSac x : lst1) {
            System.out.println(x.toString());
        }
    }
}
