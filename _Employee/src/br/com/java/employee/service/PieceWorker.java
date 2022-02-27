package br.com.java.employee.service;

import br.com.java.employee.model.Employee;

public class PieceWorker extends Employee {
	
	double wage;
	int numberOfItems;
	Earnings earning = new Earnings();

	// Contrutor para classe PieceWorker.
	public PieceWorker(String firstName, String lastName, double wage, int numberOfItems) {
		super(firstName, lastName);
		
//		this.wage  = wage;
//		this.numberOfItems = numberOfItems;
		
		this.wage  = earning.pieceWorker(wage, numberOfItems);
	 
	}

	public double getWage() {
		return wage /* numberOfItems*/;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	@Override
	public String toString() {

		return "Piece worker: " + super.toString();
	}

}
