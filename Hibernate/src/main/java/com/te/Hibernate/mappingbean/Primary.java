package com.te.Hibernate.mappingbean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "primary_table")
public class Primary implements Serializable {

	@Id
	@Column
	private int pId;
	
	@Column
	private String pName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Secondary secondary;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> address;
	
	
}
