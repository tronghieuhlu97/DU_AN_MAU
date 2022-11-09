/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.MauSac;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IMauSacRepository {

    List<MauSac> getAll();

    MauSac getById(String id);

    MauSac getByTen(String ten);
    
    boolean add(MauSac mauSac);

    boolean update(String id, MauSac mauSac);

    boolean delete(String id);
}
