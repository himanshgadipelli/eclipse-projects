package org.pradeep.javaperks.Credit;

import java.util.Date;

public class CardHolderInfo {
	
	String name;
	String streetLineDesc1;
	String streetLineDesc2;
	String cityName;
	String zipcode;
	Date dateOfBirth;
	
	public CardHolderInfo(String name,String address1, String address2, String cityName,String zipCode, Date dateOfBirth){
		
		this.name = name;
		this.streetLineDesc1=address1;
		this.streetLineDesc2=address2;
		this.cityName=cityName;
		this.zipcode=zipCode;
		this.dateOfBirth=dateOfBirth;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreetLineDesc1() {
		return streetLineDesc1;
	}
	public void setStreetLineDesc1(String streetLineDesc1) {
		this.streetLineDesc1 = streetLineDesc1;
	}
	public String getStreetLineDesc2() {
		return streetLineDesc2;
	}
	public void setStreetLineDesc2(String streetLineDesc2) {
		this.streetLineDesc2 = streetLineDesc2;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
