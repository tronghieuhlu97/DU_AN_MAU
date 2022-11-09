/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.DongSP;
import DomainModel.KhachHang;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IKhachHangRepository {

    List<KhachHang> getAll();

    KhachHang getKHById(String id);

    boolean add(KhachHang khachhang);

    boolean update(String id, KhachHang khachhang);

    boolean delete(String id);
}
