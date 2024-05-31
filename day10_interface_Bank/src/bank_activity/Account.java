package bank_activity;

public class Account {
	private String accname,email;
	private double balance;
	
	@Override
	public String toString() {
		return "Account [accname=" + accname + ", email=" + email + ", bal=" + balance + "]";
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
