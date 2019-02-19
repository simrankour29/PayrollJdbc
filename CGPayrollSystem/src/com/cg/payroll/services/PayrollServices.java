package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailNotfoundException;

public interface PayrollServices {
	
	public int acceptAssociateDetails(String firstName, String lastName, String emailId, String department, int yearlyInvestmentUnder80C, String designation,
			String pancard, int basicSalary,int hra, int epf, int companyPf, int accountNumber,
			String bankName, String ifscCode);
	int calculateNetSalary(int associateId) throws AssociateDetailNotfoundException;
//	int calculateGrossSalary(int associateId) throws AssociateDetailNotfoundException;
	Associate getAssociateDetails(int associateId) throws AssociateDetailNotfoundException;
	
	List<Associate> getAllAssociateDetails();
	
}