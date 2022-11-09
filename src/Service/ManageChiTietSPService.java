/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModel.ChiTietSP;
import Repositories.ChiTietSanPhamRepository;
import Repositories.DongSPRepository;
import Repositories.IChiTietSPRepository;
import Repositories.IDongSPRepository;
import Repositories.IMauSacRepository;
import Repositories.INsxRepository;
import Repositories.ISanPhamRepository;
import Repositories.MauSacRepository;
import Repositories.NsxRepository;
import Repositories.SanPhamRepository;
import ViewModels.QLCtsp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Hieu
 */
public class ManageChiTietSPService implements IManageChiTietSPService {

    private IChiTietSPRepository _iChiTietSPRepository = new ChiTietSanPhamRepository();
    private IMauSacRepository _iMauSacRepository = new MauSacRepository();
    private IDongSPRepository _iDongSPRepository = new DongSPRepository();
    private ISanPhamRepository _iSanPhamRepository = new SanPhamRepository();
    private INsxRepository _iNsxRepository = new NsxRepository();
//    @Override
//    public List<QLCtsp> getAll() {
//        return _iChiTietSPRepository.getAll();
//    }
//
//    @Override
//    public ChiTietSP getById(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String add(ChiTietSP chitietsp) {
//        return _iChiTietSPRepository.Add(chitietsp)?"Thêm thành công":"Thêm thất bại";
//    }
//
//    @Override
//    public String update(String id, ChiTietSP chitietsp) {
//        return _iChiTietSPRepository.Update(id, chitietsp)?"Sửa thành công":"Sửa thất bại";
//    }
//
//    @Override
//    public String delete(String id) {
//        return _iChiTietSPRepository.Delete(id)?"Xóa thành công":"Xóa thất bại";
//    }

    @Override
    public List<QLCtsp> getAll() {
        List<ChiTietSP> lstctsp = _iChiTietSPRepository.getAll();
        List<QLCtsp> lstqlctsp = new ArrayList<>();
        QLCtsp qlctsp;
        for (ChiTietSP ctsp : lstctsp) {
            qlctsp = new QLCtsp();
            qlctsp.setId(ctsp.getId());
            qlctsp.setTensp(_iSanPhamRepository.getSanPhamById(ctsp.getIdsp()).getTen());
            qlctsp.setTennsx(_iNsxRepository.getNsxById(ctsp.getIdnsx()).getTen());
            qlctsp.setTenms(_iMauSacRepository.getById(ctsp.getIdms()).getTen());
            qlctsp.setTendsp(_iDongSPRepository.getDongSPById(ctsp.getIddsp()).getTen());
            qlctsp.setNambh(ctsp.getNambh());
            qlctsp.setMota(ctsp.getMota());
            qlctsp.setSoluongton(ctsp.getSoluongton());
            qlctsp.setGianhap(ctsp.getGianhap());
            qlctsp.setGiaban(ctsp.getGiaban());
            lstqlctsp.add(qlctsp);
        }
        return lstqlctsp;
    }

    @Override
    public QLCtsp getById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(QLCtsp qlchitietsp) {
        ChiTietSP chitietsp = new ChiTietSP();
        //chitietsp.setId(qlchitietsp.getId());
        chitietsp.setIdsp(_iSanPhamRepository.getByTen(qlchitietsp.getTensp()).getId());
        chitietsp.setIdnsx(_iNsxRepository.getByTen(qlchitietsp.getTennsx()).getId());
        chitietsp.setIdms(_iMauSacRepository.getByTen(qlchitietsp.getTenms()).getId());
        chitietsp.setIddsp(_iDongSPRepository.getDSPByTen(qlchitietsp.getTendsp()).getId());
        chitietsp.setNambh(qlchitietsp.getNambh());
        chitietsp.setMota(qlchitietsp.getMota());
        chitietsp.setSoluongton(qlchitietsp.getSoluongton());
        chitietsp.setGianhap(qlchitietsp.getGianhap());
        chitietsp.setGiaban(qlchitietsp.getGiaban());
        return _iChiTietSPRepository.Add(chitietsp) ? "Thêm thành công" : "Thêm thất bại";
    }

    @Override
    public String update(String id, QLCtsp qlchitietsp) {
        ChiTietSP chitietsp = new ChiTietSP();

        chitietsp.setIdsp(_iSanPhamRepository.getByTen(qlchitietsp.getTensp()).getId());
        chitietsp.setIdnsx(_iNsxRepository.getByTen(qlchitietsp.getTennsx()).getId());
        chitietsp.setIdms(_iMauSacRepository.getByTen(qlchitietsp.getTenms()).getId());
        chitietsp.setIddsp(_iDongSPRepository.getDSPByTen(qlchitietsp.getTendsp()).getId());
        chitietsp.setNambh(qlchitietsp.getNambh());
        chitietsp.setMota(qlchitietsp.getMota());
        chitietsp.setSoluongton(qlchitietsp.getSoluongton());
        chitietsp.setGianhap(qlchitietsp.getGianhap());
        chitietsp.setGiaban(qlchitietsp.getGiaban());

        return _iChiTietSPRepository.Update(id, chitietsp) ? "Sửa thành công" : "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        return _iChiTietSPRepository.Delete(id) ? "Xóa thành công" : "Xóa thất bại";

    }

    public static void main(String[] args) {
        ManageChiTietSPService ctsp = new ManageChiTietSPService();
        List<QLCtsp> lst = ctsp.getAll();
        for (QLCtsp x : lst) {
            System.out.println(x.toString());
        }

    }
}
