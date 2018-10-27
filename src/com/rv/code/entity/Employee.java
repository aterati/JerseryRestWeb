package com.rv.code.entity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder= {"empId","empName","empSal"})
public class Employee {
	
	
	int empId;
	int empSal;
	String empName;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee() {
		
	}
	
	public Employee(int empId, int empSal, String empName){
		
		this.empId = empId;
		this.empSal = empSal;
		this.empName = empName;
		
	}
	
	public String toString() {
		return null;
	}
	
	

}
