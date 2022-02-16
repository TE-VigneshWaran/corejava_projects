package com.te.Hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="student")
public class Student implements Serializable {

	@Id
	@Column
	private Integer id;

	@Column
	private String name;

	@Column
	private String dept;

	@Column
	private Integer teacherid;

}
