package com.krutarth.HibernetMavenDemo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addresId;
	
	@Column(name="Street",length = 50)
	private String street;
	
	@Column(name="City",length = 100)
	private String city;
	
	private boolean isOpen;
	
	
	@Transient//user for not create column for this feild
	private double x;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date addeddate;
	
	@Lob
	private byte[] image;
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addresId, String street, String city, boolean isOpen, double x, Date addeddate, byte[] image) {
		super();
		this.addresId = addresId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addeddate = addeddate;
		this.image = image;
	}
	public int getAddresId() {
		return addresId;
	}
	public void setAddresId(int addresId) {
		this.addresId = addresId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddeddate() {
		return addeddate;
	}
	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	

}
