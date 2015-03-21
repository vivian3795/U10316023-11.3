/**
 * ID: U10316023 </br>
 * Ex: 11.3 </br>
 * Information: </br>
 *		test class create objects of Account, SavingsAccount, CheckingAccount ,	and invokes their toString() method.
 */
 import java.util.Scanner;
public class TEST{
	public static void main(String[] args){
		//create scanner
		Scanner in = new Scanner(System.in);
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//let user know what kind of object will create
		System.out.print("Account ,set ID and balance : " );
		int INT = in.nextInt(); double DOUBLE = in.nextDouble();
		//create an Account object
		Account account = new Account(INT,DOUBLE);
		//let user set set annual interest rate
		System.out.print("set annual interest rate (%) : " );
		DOUBLE = in.nextDouble();
		account.setannualInterestRate(DOUBLE);
		//let user withdraw or deposit 
		do{
			System.out.println("withdraw(1),  deposit(2),  exit(0)" );
			INT = in.nextInt();
			switch(INT){
				case 1 : System.out.print("withdraw : ");
							DOUBLE = in.nextDouble();
							account.withdraw(DOUBLE);break;
				case 2 : System.out.print("deposit : ");
							DOUBLE = in.nextDouble();
							account.deposit(DOUBLE);break;
				case 0 : break;
			}
		}while(INT != 0);
		//Print data in the end.
		System.out.println("Account --\n"+account.toString()+"\n");
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//let user know what kind of object will create
		System.out.print("SavingsAccount ,set ID and balance : " );
		INT = in.nextInt(); DOUBLE = in.nextDouble();
		//create a SavingsAccount object
		SavingsAccount savingsaccount = new SavingsAccount(INT,DOUBLE);
		//let user set set annual interest rate
		System.out.print("set annual interest rate (%) : " );
		DOUBLE = in.nextDouble();
		savingsaccount.setannualInterestRate(DOUBLE);
		//let user withdraw or deposit 
		do{
			System.out.println("withdraw(1),  deposit(2),  exit(0)" );
			INT = in.nextInt();
			switch(INT){
				case 1 : System.out.print("withdraw : ");
							DOUBLE = in.nextDouble();
							savingsaccount.withdraw(DOUBLE);break;
				case 2 : System.out.print("deposit : ");
							DOUBLE = in.nextDouble();
							savingsaccount.deposit(DOUBLE);break;
				case 0 : break;
			}
		}while(INT != 0);
		//Print data in the end.
		System.out.println("SavingsAccount --\n"+savingsaccount.toString()+"\n");
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//let user know what kind of object will create
		System.out.print("CheckingAccount ,set ID and balance : " );
		INT = in.nextInt(); DOUBLE = in.nextDouble();
		//create a CheckingAccount object
		CheckingAccount checkingaccount = new CheckingAccount(INT,DOUBLE);
		//let user set set annual interest rate
		System.out.print("set annual interest rate (%) : " );
		DOUBLE = in.nextDouble();
		checkingaccount.setannualInterestRate(DOUBLE);
		//let user set overdraft
		System.out.print("set overdraft : " );
		DOUBLE = in.nextDouble();
		checkingaccount.setoverdraft(DOUBLE);
		//let user withdraw or deposit 
		do{
			System.out.println("withdraw(1),  deposit(2),  exit(0)" );
			INT = in.nextInt();
			switch(INT){
				case 1 : System.out.print("withdraw : ");
							DOUBLE = in.nextDouble();
							checkingaccount.withdraw(DOUBLE);break;
				case 2 : System.out.print("deposit : ");
							DOUBLE = in.nextDouble();
							checkingaccount.deposit(DOUBLE);break;
				case 0 : break;
			}
		}while(INT != 0);
		//Print data in the end.
		System.out.println("CheckingAccount --\n"+checkingaccount.toString()+"\n");

		}
}
