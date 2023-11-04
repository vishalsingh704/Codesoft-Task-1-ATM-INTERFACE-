package projectCodsoft;
import java.util.*;

class Bankaccount{
	private double balance;
	
	public Bankaccount(double Initialbalnce) {
		this.balance=Initialbalnce;
	}
	public  double Getbalance(){
		return balance;
	}
	
	public void Deposit(double amount) {
		if(amount>0) {
			System.out.println("Amount Deposited Successfully....");
			balance=balance+amount;
			System.out.println("Current Balance is:"+balance);
		}
		else {
			System.out.println("Enter Valid Amount For Deposit....");
			
		}
	}
	
	public void Withdraw(double amount) {
		if(amount <=balance) {
			System.out.println("Withdrawal Successful.....");
			balance=balance-amount;
			System.out.println("Current Balance Is :"+balance);
		}
		else if(amount >balance) {
			System.out.println("Insufficient Amount. Your Current Account Balance Is:"+balance);
		}
		else {
			System.out.println("Enter Valid amount.....");
		}
	}
}

class ATMTask{
	private Bankaccount bankaccount;

	public ATMTask(Bankaccount bankaccount) {
		this.bankaccount=bankaccount;
	}
	
	public void run() {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter 1 To Check Account Balance");
			
			System.out.println("Enter 2 Deposit The Amount");
			System.out.println("Enter 3 For Withdrawal....");
			System.out.println("Enter 4 for Exit.......");
			System.out.println("Choose Any 1 Option What Do You Want To do.....");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Current Balance Available:"+bankaccount.Getbalance());
				break;
			
			case 2:
				System.out.println("Enter Amount To Deposit....");
				int Depositamount=sc.nextInt();
				bankaccount.Deposit(Depositamount);
				break;
			case 3:
				System.out.println("Enter Amount For Withdrawal....");
				int Withdrawamount=sc.nextInt();
				
			    bankaccount.Withdraw(Withdrawamount);
			    break;
            
			case 4:
				System.out.println("Thanks For Choosing Our Service\n Visit Again");
				return;
			default :
				System.out.println("Please Enter Valid Option");
		}
	}
  }
}
public class ATMINTERFACE{
	public static void main(String args[]) {
		Bankaccount customerAccount=new Bankaccount(1000);//This is The Initial balance Of Account
		ATMTask atm=new ATMTask(customerAccount);
		atm.run();
	}
}



