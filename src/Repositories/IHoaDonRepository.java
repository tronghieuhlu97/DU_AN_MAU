/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.ChiTietSP;
import DomainModel.HoaDon;
import ViewModels.QLCtsp;
import ViewModels.QLhd;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IHoaDonRepository {

    List<HoaDon> getAll();

    HoaDon getById(String id);

    boolean Add(HoaDon hoadon);

    boolean Update(String id, HoaDon hoadon);

    boolean Delete(String id);
}
