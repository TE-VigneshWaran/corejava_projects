package com.te.Hibernate.mappingbean1;

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
	@Column
	private int id;

	@Column
	private String curentAddress;

	@Column
	private String newAddress;

}
