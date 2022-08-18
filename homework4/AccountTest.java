package homework4;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1 = new Account(10900);
		Account account2 = new Account(500);
		
		AccountClient accountClient = new AccountClient();
		
		accountClient.paraYatir(account1, 100);
		accountClient.paraYatir(account1, 200);
		
		accountClient.paraYatir(account2, 200);
		accountClient.paraCek(account2, 300);
		
		accountClient.havale(account2, account1, 100);
		accountClient.havale(account2, account1, 200);
		accountClient.havale(account2, account1, 90);
	
	}

}
