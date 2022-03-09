package Assignment;

public  class main extends Account {

	
	public main(long a1, double a2, String a3) {
		super(a1, a2, a3);
		// TODO Auto-generated constructor stub	}
	}
	public static void main(String[] args) {
		Account a1= new Account(987654321,5000000,"Prema");
		a1.displayAccount();
		a1.setAccountNo(987654321);
		a1.setAccountBalance(5000000);
		a1.setAccountPassword("Prema");
		System.out.println(a1.getAccountNo());
		System.out.println(a1.getAccountBalance());
		System.out.println(a1.getAccountPassword());


	}
}