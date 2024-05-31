package bank_activity;

public class Transaction implements Bank{

	@Override
	public void deposite(Account ac, double amt) {
		// TODO Auto-generated method stub
		
		if(amt > 20000)
		{
			System.out.println("You Can't Deposit More than 20000");
		}
		else
		{
			System.out.println("Previous Bal. : "+ac.getBalance());
			double newbal = ac.getBalance() + amt;
			ac.setBalance(newbal);
			System.out.println("\n"+amt+" deposited....");
			System.out.println("\nAva. Bal. Is "+ac.getBalance());
		}
	}

	@Override
	public void withdraw(Account ac, double amt) {
		// TODO Auto-generated method stub
		if(amt > 10000)
		{
			System.out.println("You Can't Withdraw More than 10000");
		}
		else
		{
			System.out.println("Previous Bal. : "+ac.getBalance());
			if((ac.getBalance() - amt) < 1000);
			{
				System.out.println("Your Withdraw Transaction Has Been Canceled Due To Low Balance");
			}
			
			double newbal = ac.getBalance() - amt;
			ac.setBalance(newbal);
			System.out.println("\n"+amt+" Withdraw....");
			System.out.println("\nAva. Bal. Is "+ac.getBalance());
		}
	}
}
