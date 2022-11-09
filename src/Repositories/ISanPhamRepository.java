/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.SanPham;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface ISanPhamRepository {
    List<SanPham> getAll();

    SanPham getSanPhamById(String id);

    SanPham getByTen(String ten);
    
    boolean add(SanPham sanpham);

    boolean update(String id, SanPham sanpham);

    boolean delete(String id);
}
