import java.util.Scanner;

public class UserInterface {
	private Bank bank;
	private Scanner scanner;
	
	public UserInterface(Bank bank, Scanner scanner) {
		this.bank = bank;
		this.scanner = scanner;
	}
	
	public void show() {
		System.out.println("Welcome! " + bank.getName());
		System.out.println("Your ID is " + bank.getID());
		System.out.println();
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withraw");
		System.out.println("D: Previous Transaction");
		System.out.println("E: Exit");
		
		String userInput = "";
		
		do {
			System.out.println("========================================================================");
			System.out.println("Enter an option");
			System.out.println("========================================================================");
			
			userInput = scanner.nextLine().toUpperCase();
			
			switch(userInput) {
			
			case "A":
				System.out.println("--------------------------------------");
				System.out.println("Balance = " + bank.getBalance());
				System.out.println("--------------------------------------");
				System.out.println();
				break;
				
			case "B": 
				System.out.println("--------------------------------------");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("--------------------------------------");
				
				int userAmountToBeDeposited = Integer.valueOf(scanner.nextLine());
				bank.deposit(userAmountToBeDeposited);
			
				System.out.println();
				break;
				
			case "C":
				System.out.println("--------------------------------------");
				System.out.println("Enter an amount to withdraw: ");
				System.out.println("--------------------------------------");
				
				int userAmountToWithraw = Integer.valueOf(scanner.nextLine());
				bank.withraw(userAmountToWithraw);
				
				System.out.println();
				break;
				
			case "D":
				System.out.println("--------------------------------------");
				bank.previousTransaction();
				System.out.println("--------------------------------------");
				System.out.println();
				break;
				
			case "E":
				System.out.println("*********************************************************");
				break;
				
			default: 
				System.out.println("Invalid Option! Please try again");
				break;
			}
			
		} while(!userInput.equals("E"));
		
		System.out.println("Thank you for using our service!");
	}
}
