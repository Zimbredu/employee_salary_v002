package br.com.java.employee.service;

import br.com.java.employee.model.Employee;

public class HourlyWorker extends Employee {
	
	double wagePerHour;
	double hoursWorked;
	Earnings earning = new Earnings();
	
	//Contrutor para a classe HourlyWorker.
	public HourlyWorker(String firstName, String lastName, double wagePerHour, double hoursWorked) {
		super(firstName, lastName);

		this.wagePerHour = earning.hourlyWorker(wagePerHour, hoursWorked);
		/* this.hoursWorked = earning.earningBoss(hoursWorked); */
		
		
	}

	
  public double getWagePerHour() {
		return wagePerHour/* * hoursWorked */;
	}


	public double getHoursWorked() {
		return hoursWorked;
	}


@Override
public String toString() {
	
	return "Hourly worker: " +super.toString();
}
}
