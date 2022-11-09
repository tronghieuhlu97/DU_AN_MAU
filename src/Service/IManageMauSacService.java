/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.MauSac;
import ViewModels.QLMauSac;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IManageMauSacService {

    List<QLMauSac> getAll();

    QLMauSac getById(String id);

    String add(QLMauSac qlmauSac);

    String update(String id, QLMauSac qlmauSac);

    String delete(String id);
}
