package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		List<Employee> list = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be add?");
		int quantity = sc.nextInt();
		
		for(int i = 0; i < quantity; i++) {
			
			System.out.println("Employee #" + (i + 1) + ": " );
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours:");
			int hours = sc.nextInt();
			System.out.println("Value per hours:");
			double valuePerHours = sc.nextDouble();
			System.out.println("Is employee an out sourced? (y/n)");
			char answer = sc.next().charAt(0);
			
				if(answer == 'y') {
					System.out.println("Additional Charge");
					double additionalCharge = sc.nextDouble();
					Employee emp = new OutsourceEmployee(name, hours, valuePerHours, additionalCharge);
					list.add(emp);
				}else {
					list.add(new Employee(name, hours, valuePerHours));
				}
				
				
		}
		
		System.out.println("Payment: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - " + emp.payment());
		}
		
		
		sc.close();
	}

}
