package Javaproject;

import java.util.*;

 class ATM{
	
	float Balance;
	
	int PIN=9887;
	
	public void checkpin() {
		
		System.out.println("Enter your PIN: ");
		
		Scanner sc= new Scanner(System.in);
		
		int enteredpin= sc.nextInt();
		
		if (enteredpin==PIN) {
			main();
		}else {
			System.out.println("Enter a Valid PIN: "+" ");
			checkpin();
		}
		
		
	}
	public void main() {
		System.out.println("Enter your choice: "+" ");
		System.out.println("1./*******Check A/C balance********/");
		System.out.println("2./**** Withdraw money****/: ");
		System.out.println("3. /**Deposite Money**/ : ");
		
		System.out.println("4./* Exit*/: ");
		
		Scanner sc= new Scanner(System.in);
		
		int option= sc.nextInt();
		
		if (option==1) {
			
			CheckBalance();
			
		}else if (option==2) {
			
			Withdraw();
		}
		else if (option==3) {
			
			Deposite();
		}
		else if (option==4) {
			
			System.out.println("BEST OF LUCK");
			
			return;
		}
		else {
			
			System.out.println("Enter the Valid choice: "+" ");
			
		}
 		
	}
	public void CheckBalance() {
		 
		System.out.println("Account Balance:"+" "+Balance+" " );
		System.out.println(" ");
		
		
		main();
		
	} 
	public void Withdraw() {
		System.out.println("Enter Amount to Withdraw:"+" ");
		Scanner sc=  new Scanner(System.in);
		float amount= sc.nextFloat();
		if (amount>Balance) {
			System.out.println("Insufficient Balance"+" ");
			
		}
		else {
			Balance= Balance-amount;
			System.out.println("Money Withdraw Successfully: "+" ");
		}
		main();
	}
	public void Deposite() {
		System.out.println("Enter Deposite Amount: "+" ");
		Scanner sc= new Scanner(System.in);
		float amount= sc.nextFloat();
		
		Balance=Balance+amount;
		System.out.println("Money Deposite Successfylly:"+" ");
		
		main();
	}
}

  public class AtmMachine {

	public static void main(String[] args) {
		
		ATM obj= new ATM();
		
		obj.checkpin();
		
	}

}
