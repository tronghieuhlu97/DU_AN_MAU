/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.MauSac;
import DomainModel.NhanVien;
import ViewModels.QLNv;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface INhanVienRepository {
    List<NhanVien> getAll();

    NhanVien getById(String id);

    boolean add(NhanVien nv);

    boolean update(String id, NhanVien nv);

    boolean delete(String id);
}
