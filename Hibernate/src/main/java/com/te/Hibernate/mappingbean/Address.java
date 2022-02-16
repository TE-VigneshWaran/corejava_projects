package com.te.Hibernate.mappingbean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "address_table")
public class Address {

	@Id
	private int id;
	
	@Column
	private String currentAddress;
	
	@Column
	private String permanantAddress;
	
	
}
