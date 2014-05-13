package net.smktarunabhakti.penjualan.dao;

import net.smktarunabhakti.penjualan.domain.Barang;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author armadeas
 */
public interface BarangDao extends PagingAndSortingRepository<Barang, String>{
    
}