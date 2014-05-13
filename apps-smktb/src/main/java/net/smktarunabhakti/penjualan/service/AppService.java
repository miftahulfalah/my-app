/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.service;


import net.smktarunabhakti.penjualan.domain.Barang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
/**
 *
 * @author Reyzel
 */
public interface AppService {
    
    void simpanBarang(Barang b);
    
    void hapusBarang(Barang b);
    
    Page<Barang> cariSemuaBarang (Pageable p);
    
    Barang CariBarangById(String id);
    
    Long countSemuabarang();
    
}
