/*
 * Obs.: Alterações na regra de negócio:
 *  1 - O calculo dos ganhos foi isolado em classe(Earnings), executa os calculo p/ todo os "tipos" de employee.    
 *  2 - Na classe(Earning) foram implementados limites de ganhos/pagamentos.
 */


package br.com.java.employee.application;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.java.employee.model.Employee;
import br.com.java.employee.service.Boss;
import br.com.java.employee.service.CommissionWorker;
import br.com.java.employee.service.Earnings;
import br.com.java.employee.service.HourlyWorker;
import br.com.java.employee.service.PieceWorker;


public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee employee;// referência para a superClasse.
	
		String output = "";
		Earnings earning = new Earnings();
		String answer = " ";
		double answerD = 0.0;		
		int answerI;

		System.out.println("Digite o nome, sobrenome e salário.");
		Boss boss = new Boss(answer = input.next()
				, answer = input.next()
				, answerD = input.nextDouble());
		
		System.out.println("Digite o nome, sobrenome, salário, comissão e quantidade de itens vendidos.");
		CommissionWorker commissionWorker = new CommissionWorker(answer = input.next()
				, answer = input.next()
				, answerD = input.nextDouble()
				, answerD = input.nextDouble()
				, answerI = input.nextInt());
		System.out.println("Digite o nome, sobrenome, salário(por peça) e quantidade de peças produzidas.");
		PieceWorker pieceWorker = new PieceWorker(answer = input.next()
				, answer = input.next()
				, answerD = input.nextDouble()
				, input.nextInt());
		System.out.println("Digite o nome, sobrenome, salário(por hora) e  horas trabalhadas.");
		HourlyWorker hourlyWorker = new HourlyWorker(input.next()
				, input.next()
				, input.nextDouble()
				, input.nextInt());
		DecimalFormat precision2 = new DecimalFormat("0.00");
		
		//Referência Employee para Boss.
		employee = boss;
		
		output += 
		     boss.toString() + " earned $ "	+
	         precision2.format(boss.getSalary())  + "\n";
	   
		//Referência Employee para um CommissionWorker..
		employee = commissionWorker;
			
		output += 
		     commissionWorker.toString() + " earned $ "	+				
	     precision2.format(commissionWorker.getSalary()) + "\n";
             	 
		
		//Referência Employee para um PieceWorker..
		employee = pieceWorker;
					
		output += 
		     pieceWorker.toString() + " earned $ "	+
             precision2.format(pieceWorker.getWage()) + "\n";
		
		//Referência Employee para um HourlyWorker..
		employee = hourlyWorker;
							
		output += /* employee.toString() + " earned $ " + */
				/* precision2.format(employee.earnings()) + "\n" + */
		     hourlyWorker.toString() + " earned $ "	+

             precision2.format(hourlyWorker.getWagePerHour()) + "\n";
								
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating Polymorphism", JOptionPane.INFORMATION_MESSAGE);
		 System.exit(0);
						
				
				

	}

}
