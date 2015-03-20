/**
 * ID: U10316023 </br>
 * Ex: 11.3 </br>
 * Information: </br>
 *		CheckingAccount class was designed with the requirements on page 468
 */
public class CheckingAccount extends Account{
	//data field
	private double overdraft;
	
	//access overdraft
	public double getoverdraft(){
		return overdraft;
	} 
	//set a new overdraft
	public void setoverdraft(double overdraft){
		this.overdraft = overdraft;
	}
	
	//constructor
	CheckingAccount(){
		super();
		overdraft = 0;
	}
	//constructor with id & balance
	CheckingAccount(int id,double balance){
		super(id, balance);
		overdraft = 0;
	}
	
	@Override
	public double withdraw(double minus){
		balance -= minus;
		if(balance >= -overdraft)
			return balance;
		else
			System.out.println("Exceeding overdraft , invalid input");
			balance += minus; 
			return balance;
	}
}
