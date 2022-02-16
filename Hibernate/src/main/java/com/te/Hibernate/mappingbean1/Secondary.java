package com.te.Hibernate.mappingbean1;

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
	@Column
	private int sId;
	
	@Column
	private String sName;

}
