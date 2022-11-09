/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.DongSP;
import DomainModel.KhachHang;
import ViewModels.QLKhachHang;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IManageKhachHangService {

    List<QLKhachHang> getAll();

    QLKhachHang getById(String id);

    String add(QLKhachHang qlkhachhang);

    String update(String id, QLKhachHang qlkhachhang);

    String delete(String id);
}
