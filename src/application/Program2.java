package application;

import entities.Account;
import entities.BusinessAcconut;
import entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {

		System.out.println();

		// INSTANCIANDO
		Account account = new Account(1001, "Alex", 1000.0);
		BusinessAcconut acconut2 = new BusinessAcconut(1002, "Eduardo", 1000.00, 500.0);
		SavingsAccount account3 =  new SavingsAccount(1004, "Junior", 1000.00, 0.01);

		//Testando o métado de retirada de valor para conta padrão, com taxa de 5 reais.
		//Usando sobreposição da superclasse para a subclasse
		account.withdraw(200.00);
		System.out.println("Retirada de uma conta padrão: " +  account.getBalance());

		//Testando o métado de retirada de valor para conta polpança, sem taxas.
		//Usando sobreposição da superclasse para a subclasse
		account3.withdraw(200.00);
		System.out.println("Retirada de uma conta poupança: " + account3.getBalance());

		//Testando o métado de retirada de valor com super, taxa de 2 reais.
		//Usando sobreposição da superclasse para a subclasse
		acconut2.withdraw(200.0);
		System.out.println("Retirada para conta empresarial: " + acconut2.getBalance());
	}

}
