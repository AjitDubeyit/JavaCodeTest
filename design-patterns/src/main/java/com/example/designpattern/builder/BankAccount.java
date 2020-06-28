package com.example.designpattern.builder;

public class BankAccount {
    public long accountNumber;
	public String owner;
	public double balance;
	public String branch;
	public double interestRate;
	
	public static class Builder {
        private long accountNumber; //This is important, so we'll pass it to the constructor.
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;
        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        
        public Builder withOwner(String owner){
            this.owner = owner;
            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }
        public Builder openingBalance(double balance){
            this.balance = balance;
            return this;
        }
        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }
        public BankAccount build(){
            //Here we create the actual bank account object, which is always in a fully initialised state when it's returned.
            BankAccount account = new BankAccount();  //Since the builder is in the BankAccount class, we can invoke its private constructor.
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
    }
    //Fields omitted for brevity.
    private BankAccount() {
        //Constructor is now private.
    }
    
    
    //Getters and setters omitted for brevity.
    
    @Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", owner=" + owner + ", balance=" + balance + ", branch="
				+ branch + ", interestRate=" + interestRate + "]";
	}


	public static void main(String[] args) {
		BankAccount ba = new BankAccount
				.Builder(12345L)
				.withOwner("Ajit")
				.openingBalance(100)
				.atRate(8.35)
				.atBranch("Pune")
				.build();
		System.out.println(ba.toString());
	}
}