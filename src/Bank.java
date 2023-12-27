
public class Bank {
	private int balance;
	private int previousTransaction;;
	private String name;
	private String ID;
	
	public Bank(String name, String ID) {
		this.name = name;
		this.ID = ID;
	}
	
	public void withraw(int amount) {
		if(amount > 0) {
			if(this.balance <= amount) {
				amount = balance;
				this.balance = 0;
			} else {
				this.balance -= amount;
			}
			this.previousTransaction = -amount;
		}
	}
	
	public void deposit(int amount) {
		if(amount > 0) {
			this.balance += amount;
			this.previousTransaction = amount;
		}
	}
	
	public void previousTransaction() {
		if(this.previousTransaction > 0) {
			System.out.println("Deposited: " + this.previousTransaction);
		} else if(this.previousTransaction < 0) {
			System.out.println("Withrawn: " + Math.abs(this.previousTransaction));
		} else {
			System.out.println("No transcation occured");
		}
	}

	public int getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return ID;
	}

	public int getPreviousTransaction() {
		return previousTransaction;
	}
}
