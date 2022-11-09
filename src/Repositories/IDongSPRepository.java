/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.DongSP;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IDongSPRepository {

    List<DongSP> getAll();

    DongSP getDongSPById(String id);

    DongSP getDSPByTen(String ten);
    
    boolean add(DongSP dongsp);

    boolean update(String id, DongSP dongsp);

    boolean delete(String id);
}
