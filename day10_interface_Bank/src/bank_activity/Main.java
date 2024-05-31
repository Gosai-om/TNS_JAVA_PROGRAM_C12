package bank_activity;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac  = new Account();
		
		ac.setAccname("Om Gosai");
		ac.setEmail("gosaiom65@");
		ac.setBalance(5000);
		
		Transaction tc = new Transaction();
		tc.deposite(ac,2500);
		tc.withdraw(ac, 500);
		
		System.out.println(ac);
	}

}
