package com.te.Hibernate.mappingbean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "secondary_table")
public class Secondary {

	@Id
	private int sId;
	
	@Column
	private String sName;
	
	@Column
	private String sAddress;
}
