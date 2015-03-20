/**
 * ID: U10316023 </br>
 * Ex: 11.3 </br>
 * Information: </br>
 *		SavingsAccount class was designed with the requirements on page 469
 */
public class SavingsAccount extends Account{
	//no-arg constructor create default account
	SavingsAccount(){
		super();
	}
	//constructor with id & balance
	SavingsAccount(int id,double balance){
		super(id, balance);
	}
	
	//savings account cannot overdrawn. If overdrawn , let user know.
	@Override
	public double withdraw(double minus){
	setbalance(getbalance() - minus);
		if(getbalance() >= 0)
			return getbalance();
		else
			System.out.println("Overdrawn , invalid input");
			setbalance(getbalance() + minus); 
			return getbalance();
	}
}
