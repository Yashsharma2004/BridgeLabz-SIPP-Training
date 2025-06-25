package oops.keywords;


class Banks{
	static String bankName="ABC Bank";
	static int totalAccounts=0;
	final int accountNumber;
	String accountHolderName;
	
	Banks(String accountHolderName,int accountNumber){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		totalAccounts++;
	}
	
	static void getTotalAccounts() {
		System.out.println("Total Accounts: "+totalAccounts);
	}
	
	void displayDetails() {
		if(this instanceof Banks) {
			System.out.println("Account Holder: "+accountHolderName);
			System.out.println("Account Number: "+accountNumber);
			System.out.println("Bank Name: "+bankName);
		}
	}
	
}