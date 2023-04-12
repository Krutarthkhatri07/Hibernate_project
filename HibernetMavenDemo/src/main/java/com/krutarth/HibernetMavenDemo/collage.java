package com.krutarth.HibernetMavenDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class collage {
	
	@Id
	private int cid;
	private String name;
	
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	private Certificate certi;
	public collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public collage(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
