/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.NSX;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface INsxRepository {

    List<NSX> getAll();

    NSX getNsxById(String id);

    NSX getByTen(String ten);
    
    boolean add(NSX nsx);

    boolean edit(String id, NSX nsx);

    boolean delete(String id);
}
