/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.NSX;
import DomainModel.NhanVien;
import ViewModels.QLNv;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IManageNhanVienService {
     List<QLNv> getAll();

    QLNv getNVById(String id);

    String add(QLNv qlnv);

    String edit(String id, QLNv qlnv);

    String delete(String id);
}
