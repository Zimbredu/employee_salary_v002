package br.com.java.employee.service;

public class Earnings {

	public double earningBoss(double salary) {
	
		double weeklySalary = (salary > 0 & salary <= 800 ? salary : 0);//Adicionei um limite de ganho comparado c/ o código original.
		
		return   weeklySalary;
		
	}

	public double commissionWorker(double weeklySalary, double itemCommission, int totalSold) {				
		double salary = (weeklySalary > 400 ? weeklySalary = 0 : weeklySalary);
		
		double commission = itemCommission ;
		
		double quantityOfItemsSold = totalSold;  
		
		return  salary > 800 ? salary = 0 : salary + (commission * quantityOfItemsSold);
		

		}
	
	
	public double pieceWorker(double wage, int numberOfItems){	
		double wagePerPiece = wage;
		
		double quantityOfItemsProduced = numberOfItems;
		
		return quantityOfItemsProduced > 40 | wagePerPiece > 13.75 ? quantityOfItemsProduced = 0 : quantityOfItemsProduced * wagePerPiece;
	}
	
	public double hourlyWorker(double wagePerHour, double hoursWorked ){
		double wage = wagePerHour;
		
		double hours = hoursWorked;
		
		return wage > 2.5 | hoursWorked > 220 ? wage  = 0 : wage * hours;
		
	}
	
	
	}


