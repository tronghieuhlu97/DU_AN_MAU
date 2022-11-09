/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.CuaHang;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface ICuaHangRepository {

    List<CuaHang> getAll();

    CuaHang getById(String id);

    boolean add(CuaHang cuahang);

    boolean update(String id, CuaHang cuahang);

    boolean delete(String id);
}
