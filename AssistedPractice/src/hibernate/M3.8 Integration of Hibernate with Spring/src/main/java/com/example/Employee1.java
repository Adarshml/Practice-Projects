package com.example;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
@Column
	private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}

