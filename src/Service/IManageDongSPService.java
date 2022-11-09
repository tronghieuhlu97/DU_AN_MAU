/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.DongSP;
import ViewModels.QLDongSP;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IManageDongSPService {

    List<QLDongSP> getAll();

    QLDongSP getById(String id);

    
    String add(QLDongSP qldongsp);

    String update(String id, QLDongSP qldongsp);

    String delete(String id);
}
