/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.ChucVu;
import DomainModel.CuaHang;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IChucVuRepository {
    List<ChucVu> getAll();

    ChucVu getById(String id);

    ChucVu getByTen(String ten);
    
    boolean add(ChucVu chucvu);

    boolean update(String id, ChucVu chucvu);

    boolean delete(String id);
}
