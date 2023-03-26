package com.spring.erp;

public class Home {

	private String id;
	private String name;
	private String detail;
	
	
	public Home(String string, String name, String detail) {
		super();
		this.id = string;
		this.name = name;
		this.detail = detail;
	}
	
	
	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Home [id=" + id + ", name=" + name + ", detail=" + detail + "]";
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
