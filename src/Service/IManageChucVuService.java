/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.ChucVu;
import DomainModel.CuaHang;
import ViewModels.QLChucVu;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IManageChucVuService {
    List<QLChucVu> getAll();

    QLChucVu getById(String id);

    String add(QLChucVu qlcv);

    String update(String id, QLChucVu qlcv);

    String delete(String id);
}
