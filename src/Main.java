import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Bank bankAccount = new Bank("Taniksh", "UID-0001");
		UserInterface ui = new UserInterface(bankAccount, scanner);
		
		ui.show();
	}

}
