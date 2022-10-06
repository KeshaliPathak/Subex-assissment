package com.api.Restapi.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Auto increment
	private long id;
	@Column(name="studentname")
	private String name;
	private Integer age;
	private String gender;

	@Column(name="address")
	private String City;


	public User()
	{
		super();

	}

	public User(long id, String name, Integer age, String gender, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		City = city;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", City=" + City + "]";
	}




}
