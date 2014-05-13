/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.impl;


import net.smktarunabhakti.penjualan.dao.BarangDao;
import net.smktarunabhakti.penjualan.domain.Barang;
import net.smktarunabhakti.penjualan.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 *
 * @author Reyzel
 */

@SuppressWarnings("unchecked")

@Transactional
public class AppServiceImpl implements AppService{

    @Autowired
    public BarangDao barangdao;
    
    @Override
     public void simpanBarang(Barang b) {
        barangdao.save(b);
    }

    @Override
    public void hapusBarang(Barang b) {
         if(b==null || b.getId()==null){
            return;        
        }
        barangdao.delete(b);
    }

    @Override
    public Page<Barang> cariSemuaBarang(Pageable p) {
      if(p == null){
            p = new PageRequest(0, 20);
        }
        return barangdao.findAll(p);
    }

    @Override
    public Barang CariBarangById(String id) {
       if(!StringUtils.hasText(id)){
            return null;
        }
        return barangdao.findOne(id);
    }

    @Override
    public Long countSemuabarang() {
    return barangdao.count();
  }

  
}
