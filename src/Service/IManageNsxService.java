/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.NSX;
import ViewModels.QLNSX;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IManageNsxService {

    List<QLNSX> getAll();

    QLNSX getNsxById(String id);

    String add(QLNSX qlnsx);

    String edit(String id, QLNSX qlnsx);

    String delete(String id);
}
