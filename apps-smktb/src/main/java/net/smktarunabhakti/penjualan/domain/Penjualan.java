/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Reyzel
 */
//@Coloumn untuk typedata untuk string 
//@lob untuk typedata text
//untuk membuka setter and getter : alt+ins kalo eclise : alt+shift+s-r
//@temporal untuk waktu
@Entity
@Table(name="trx_jual_header")

public class Penjualan {
    
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String Id;
    
    @Column(name="waktu_transaksi")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP) // data type pada sql data + time : hh-mm-yyyy
    private Date tgl;
    
    @Column(nullable=false)
    //di @Column kalo name nya sama tidak usah ditulis 
    private String kasir;
    
    @Column(name="no_struk",nullable = false)
    private String noStruk;

    @OneToMany(mappedBy = "header")
    @Cascade(value = CascadeType.ALL)
    private List<Detail> listPenjualanDetai = new
     ArrayList<Detail>();
    
    public String getId() {
        return Id;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public String getKasir() {
        return kasir;
    }

    public void setKasir(String kasir) {
        this.kasir = kasir;
    }

    public String getNoStruk() {
        return noStruk;
    }

    public void setNoStruk(String noStruk) {
        this.noStruk = noStruk;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
}
