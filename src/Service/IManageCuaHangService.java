/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.CuaHang;
import ViewModels.QLCuaHang;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IManageCuaHangService {

    List<QLCuaHang> getAll();

    QLCuaHang getById(String id);

    String add(QLCuaHang qlcuahang);

    String update(String id, QLCuaHang qlcuahang);

    String delete(String id);
}
