package com.example.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_tb")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="empId")
private Long id;

@Column(name="empName")
private String name;

@Column(name="empCity")
private String city;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
}


}
