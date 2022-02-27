package br.com.java.employee.service;

import br.com.java.employee.model.Employee;

public class Boss extends Employee {
	
	double salary;
	Earnings earning = new Earnings();

	// Contrutor para a classe Boss.
	public Boss(String firstName, String lastName, double salary) {
		super(firstName, lastName);// Chama o construtor da superClasse.
		this.salary = earning.earningBoss(salary);
		 
	}   
	

	public double getSalary() {
		
		return salary;
	}

	@Override
	public String toString() {

		return "Boss: " + super.toString();
	}

}
