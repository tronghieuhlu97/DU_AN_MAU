/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.ChiTietSP;
import DomainModel.DongSP;
import ViewModels.QLCtsp;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IManageChiTietSPService {
    List<QLCtsp> getAll();

    QLCtsp getById(String id);

    String add(QLCtsp qlchitietsp);

    String update(String id, QLCtsp qlchitietsp);

    String delete(String id);
}
