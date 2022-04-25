package com.devsuperior.userdept.entities;


//IMPORTAÇÕES

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_user")

public class User {


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long Bi;
	private String name;
	private String email;
	

	@ManyToOne
	@JoinColumn(name = "department_id")
	
	private Department department;
	
	
	public User() {
		
	}
	

	public Long getBi() {
		return Bi;
	}


	public void setBi(Long bi) {
		this.Bi = bi;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	
}
