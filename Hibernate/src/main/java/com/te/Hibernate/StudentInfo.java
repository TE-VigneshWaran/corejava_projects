package com.te.Hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class StudentInfo implements Serializable {

	@Id
	@Column
	private int id;

	@Column
	private String name;

	@Column
	private String branch;

}
