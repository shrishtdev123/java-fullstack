package com.shrtist;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="empAddress")
public class EmployeeAd {

    @Id private int empId;
    private String empName;
  
   
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id_new")
    private Address address;


    public EmployeeAd() 
    { 
    	
    }

    @Override public String toString()
    {
        return "Employee []";
    }

    public int getEmpId() { return empId; }

    public void setEmpId(int empId) { this.empId = empId; }

    public String getEmpName() { return empName; }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public Address getAddress() { return address; }

    public void setAddress(Address address)
    {
        this.address = address;
    }
}
