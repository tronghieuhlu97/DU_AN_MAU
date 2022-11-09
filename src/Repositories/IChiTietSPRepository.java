/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DomainModel.ChiTietSP;
import ViewModels.QLCtsp;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public interface IChiTietSPRepository {

    List<ChiTietSP> getAll();

    ChiTietSP getById(String id);

    boolean Add(ChiTietSP chiTietSP);

    boolean Update(String id, ChiTietSP chiTietSP);

    boolean Delete(String id);
}
