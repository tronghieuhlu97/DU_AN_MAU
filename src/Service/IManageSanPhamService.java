/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.SanPham;
import ViewModels.QLSP;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IManageSanPhamService {
     List<QLSP> getAll();

    QLSP getSPById(String id);

    String add(QLSP qlsp);

    String edit(String id, QLSP qlsp);

    String delete(String id);
}
