package com.zwj.entity;

public class User {
	private String id;
	private String user_Name;
	private String password;
	private String age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_Name=" + user_Name + ", password="
				+ password + ", age=" + age + "]";
	}

}
