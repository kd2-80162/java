package com.sunbeam;

import java.util.Scanner;

public class BasePlus_Commission_Employee extends Employees {

	private double grosssales;
	private double commissionRate;
	private double baseSalary;
	private double commission;

	@Override
	public void calculateTotalCommission() {

	}

	public BasePlus_Commission_Employee() {
		this.grosssales = 0;
		this.commissionRate = 0;
		this.baseSalary = 0;
		this.commission = 0;
	}

	public BasePlus_Commission_Employee(double grosssales, double commissionRate, double baseSalary,
			double commission) {
		super();
		this.grosssales = grosssales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
		this.commission = commission;
	}

	public double getGrosssales() {
		return grosssales;
	}

	public void setGrosssales(double grosssales) {
		this.grosssales = grosssales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	@Override
	public void AcceptEmployees() {
		super.AcceptEmployees();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the grossSale");
		this.grosssales=sc.nextDouble();
		
		System.out.println("Enter the CommissionRate");
		this.commissionRate=sc.nextDouble();
		
		System.out.println("Enter the baseSalary");
		this.baseSalary=sc.nextDouble();
	}

	@Override
	public void DisplayEmployees() {
		super.DisplayEmployees();
		System.out.println("The GrossSale ="+this.grosssales);
		System.out.println("The CommissionRate="+this.commission);
		System.out.println("The baseSalary="+this.baseSalary);
	}

	@Override
	public String toString() {
		return "BasePlus_Commission_Employee [grosssales=" + grosssales + ", commissionRate=" + commissionRate
				+ ", baseSalary=" + baseSalary + ", commission=" + commission + "]";
	}

	
	
	
}
