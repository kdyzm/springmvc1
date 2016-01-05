package com.kdyzm.domain;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1298989747316274828L;
	private int id;
	private String name;
	private String address;
	private int age;

	/****************** 华丽的分割线 **************************/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
}
