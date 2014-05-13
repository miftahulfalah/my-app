/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.service;

import java.awt.print.Pageable;
import net.smktarunabhakti.penjualan.domain.Barang;
import org.springframework.data.domain.Page;

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
