package com.purchases.app.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table (name="purchase")
public class Purchase {

	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	 @Column(name = "name")
	 private String name;
	 
	 @CreationTimestamp
	 @Temporal(TemporalType.DATE)
	 @Column(name="createat")
	    private Date created;
	 
	 @Column(name="price")
	 private BigDecimal price;
	 
	
	@Column(name="currency")
	private String currency;
	
	

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Purchase() {}
	public Purchase(Long id, String name, Date created) {
		super();
		this.id = id;
		this.name = name;
		this.created = created;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", name=" + name + ", created=" + created + ", price=" + price + ", currency=" + currency + "]";
	}

	    
	






	
	
	
	
	
}
