/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
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

public class  Detail implements Serializable {

	@Id
	@GeneratedValue(generator= "system_uuid")
	@GenericGenerator(name = "system_uuid", strategy = "uuid")
	private String id;

	private String header;

	private Barang Barang;

	@Column(name="total_jumlah")
	private int jumlah;

	@Column(name="total_harga")
	private BigDecimal totalHarga;

}