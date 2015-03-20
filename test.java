/**
 * ID: U10316023 </br>
 * Ex: 11.3 </br>
 * Information: </br>
 *		test class create objects of Account, SavingsAccount, CheckingAccount ,
 * 	  and invokes their toString() method.
 */
public class test{
	public static void main(String[] args){
		/**
		*	an Account object with account ID of 1122, a balance of 20000, 
		*	annual interest rate of 4.5%. Then withdraw 2500, deposit 3000.
		*	Print data in the end.
		*/
		Account account = new Account(1122,20000);
		account.setannualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Account --\n"+account.toString()+"\n");
		
		/**
		*	a SavingsAccount object with account ID of 1122, a balance of 20000, 
		*	annual interest rate of 4.5%. Then withdraw 2500, deposit 3000.
		*	Print data in the end.
		*/
		SavingsAccount savingsaccount = new SavingsAccount(1122,20000);
		savingsaccount.setannualInterestRate(4.5);
		savingsaccount.withdraw(2500);
		savingsaccount.deposit(3000);
		System.out.println("SavingsAccount --\n"+savingsaccount.toString()+"\n");
		
		/**
		*	a CheckingAccount object with account ID of 1122, a balance of 20000, 
		*	annual interest rate of 4.5%. Then withdraw 2500, deposit 3000. 
		*	Print data in the end.
		*/		
		CheckingAccount checkingaccount = new CheckingAccount(1122,20000);
		checkingaccount.setannualInterestRate(4.5);
		checkingaccount.withdraw(2500);
		checkingaccount.deposit(3000);
		System.out.println("CheckingAccount --\n"+checkingaccount.toString()+"\n");
		}
}
