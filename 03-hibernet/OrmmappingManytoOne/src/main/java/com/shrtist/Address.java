package com.shrtist;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="addressOfEmp")
public class Address {
	
	
	@Id private int addressId;
    private String location;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
    private List<EmployeeAd> employee= new ArrayList<>();

    public Address(int addressId, String location)
    {
        this.addressId = addressId;
        this.location = location;
    }

    public Address() 
    { 
    }

    public int getAddressId()
    { 
    	return addressId;
    }

    public void setAddressId(int addressId)
    {
        this.addressId = addressId;
    }

    public String getLocation()
    { 
    	return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public List<EmployeeAd> getEmployee()
    { 
    	return employee;
    }

    public void setEmployee(List<EmployeeAd> employee)
    {
        this.employee = employee;
    }
	

}
