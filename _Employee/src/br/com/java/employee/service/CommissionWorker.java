package br.com.java.employee.service;

import br.com.java.employee.model.Employee;

public class CommissionWorker extends Employee {
	
	double salary;
	double commission;
	int quantity;
	Earnings earning = new Earnings();


	public CommissionWorker(String firstName, String lastName, double salary, double commission, int quantity) {
		super(firstName, lastName);		
		this.salary = salary;
//		this.commission = commission;
//		this.quantity = quantity;	
		this.salary = earning.commissionWorker(salary, commission,quantity);
		
		
	}

	public double getSalary() {
		
		return salary /* + (commission * quantity) */; 
	}

	public double getCommission() {
		return commission;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {

		return "Commission worker: " + super.toString();
	}

}
