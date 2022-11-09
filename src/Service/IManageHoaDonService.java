/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.HoaDon;
import DomainModel.NhanVien;
import ViewModels.QLNv;
import ViewModels.QLhd;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IManageHoaDonService {
    List<QLhd> getAll();

    QLhd getHdById(String id);

    String add(QLhd qlhd);

    String edit(String id, QLhd qlhd);

    String delete(String id);
}
