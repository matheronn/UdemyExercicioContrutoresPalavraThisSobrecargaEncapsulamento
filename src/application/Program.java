package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Holder;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double value = 0;

		System.out.println("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String accName = sc.nextLine();
		accName += sc.nextLine();
		System.out.println("Is there a initial deposit? (y/n) ");
		String opt = sc.next();
		if (opt.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			value = sc.nextDouble();
		}

		Holder holder = new Holder(accNumber, accName, value);

		System.out.println();
		System.out.println("Account data: ");
		System.out.println("Account: " + holder);

		System.out.println();
		System.out.println("Enter Deposit value: ");
		value = sc.nextDouble();
		holder.deposit(value);

		System.out.println();
		System.out.println("Updated Account data: ");
		System.out.println("Account: " + holder);

		System.out.println();
		System.out.println("Enter Withdraw value: ");
		value = sc.nextDouble();
		holder.withdraw(value);

		System.out.println();
		System.out.println("Updated Account data: ");
		System.out.println("Account: " + holder);

		sc.close();
	}
}
