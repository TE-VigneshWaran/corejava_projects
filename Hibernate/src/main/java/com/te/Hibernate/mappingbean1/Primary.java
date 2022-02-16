package com.te.Hibernate.mappingbean1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "primary_table")
public class Primary {

	@Id
	@Column
	private int pId;

	@Column
	private String pName;

	@OneToOne
	private Secondary secondary;

	@ManyToOne
	private List<Address> address;

}
