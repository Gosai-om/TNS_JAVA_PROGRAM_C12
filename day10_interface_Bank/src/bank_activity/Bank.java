package bank_activity;

public interface Bank {
	double MIN_BAL = 1000;
	double DEPOSITE_LIMIT = 20000;
	double WITHDRAW_LIMIT = 10000;

	void deposite(Account ac,double amt);
	void withdraw(Account ac,double amt);
}
