package com.nt.entity;



import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@Entity
public class EmployeeInfo implements Serializable{
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Type(type="int")
	private Integer eid;
	
	@Column(length = 20)
	@Type(type="string")
	private String ename;

	@Column(length = 20)
	@Type(type="string")
	private String eadd;
	private  LocalDateTime dob;
	private  LocalDate doj;
	private  LocalTime batchTime;
	



}
