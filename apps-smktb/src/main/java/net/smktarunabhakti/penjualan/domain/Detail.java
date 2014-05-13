/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Reyzel
 */

@Entity
@Table(name="trx_jual_detail")

public class Detail implements Serializable {
    
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    
    @ManyToOne
    private Penjualan header;
    
    @ManyToOne
    private Barang barang;
    
    
}
