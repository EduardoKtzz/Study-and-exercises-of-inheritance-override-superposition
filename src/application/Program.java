package application;

import entities.Account;
import entities.BusinessAcconut;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		//INSTANCIANDO
		System.out.println();

		//UPCASTING - SUBCLASSE PARA SUPERCLASSE
		Account account2 =  new BusinessAcconut(1003, "Bob", 0.0, 200.00);
		Account account3 =  new SavingsAccount(1004, "Junior", 1000.00, 0.01);

		//DOWNCASTING - SUPERCLASSE PARA SUBCLASSE
		BusinessAcconut acconut4 = (BusinessAcconut) account2;
		acconut4.loan(100.0);

		//ERRO POR QUE O CLASSE SAVINGSACCONT NÃO TEM EXTENDS PARA BUSSINESS
		//BusinessAcconut acconut5 = (BusinessAcconut) acconut3;

		//INSTANCEOF -  VERIFICAR SE A CLASSE TEM O EXTENS COM A OUTRA
		if (account3 instanceof BusinessAcconut) {
			BusinessAcconut acconut5 = (BusinessAcconut) account3;
			acconut5.loan(200.0);
			System.out.println("Loan!");
		}

		if ( account3 instanceof SavingsAccount) {
			SavingsAccount account5 = (SavingsAccount) account3;
			account5.updateBalance();
			System.out.println("Update!");
		}
	}

}
