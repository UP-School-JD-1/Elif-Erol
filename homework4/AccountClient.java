package homework4;

public class AccountClient {

	private static final double HAVALE_UCRETI = 5;

	public void paraCek(Account account, double amount) {
		
		if (account.getBalance() >= amount) {
			account.setBalance(account.getBalance() - amount);
			System.out.println("Hesabınızdan para çekildi.Yeni Bakiyeniz: " + account.getBalance() );
		} else {
			System.out.println("Bakiyeniz yetersiz");
		}

	}

	public void paraYatir(Account account, double amount) {
		account.setBalance(account.getBalance() + amount);
		
		System.out.println("Hesabınıza para yatırılmıştır. Yeni Bakiyeniz: " + account.getBalance() );
	}
	
	public void havale(Account fromAccount, Account toAccount, double amount) {
		
		if (fromAccount.getBalance() >= amount + HAVALE_UCRETI) {
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);
			fromAccount.setBalance(fromAccount.getBalance() - HAVALE_UCRETI);
			
			System.out.println("Hesabınıza para yatırılmıştır. Yeni Bakiyeniz: " + toAccount.getBalance() );
			System.out.println("Hesabınıza para çekilmiştir. Yeni Bakiyeniz: " + fromAccount.getBalance() );
		}
		else {
			System.out.println("Bakiyeniz yetersiz");
		}
	}
}