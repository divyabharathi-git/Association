package com.demo.Model;

import java.util.List;

public class CorporateCustomer {

	private String companyName;
	private String ceoName;
	private String address;
	private List<Representatives> representatives;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Representatives> getRepresentatives() {
		return representatives;
	}
	public void setRepresentatives(List<Representatives> representatives) {
		this.representatives = representatives;
	}
	
	
	
}
