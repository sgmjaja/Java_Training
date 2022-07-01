package bankAccount;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		   
		  
		   //Creating an object for the AccountHolder and bankAccount classes
		   AccountHolder ownerOne = new AccountHolder("self employed", 5000.10);
		   BankAccount accountOne = new BankAccount(2000, "savings");
		   
		  //Using inherited attributes to set values for the ownerOne object 
		  ownerOne.getIdNo();
		  ownerOne.setIdNo("123456");
		  ownerOne.name = "Samantha";
		  ownerOne.surname = "Fox";
		   
		   
		   System.out.println("Greetings " + ownerOne.name + " " + ownerOne.surname);
		   System.out.println("To Continue viewing your " + accountOne.accountType + " account details insert your ID number below:");
		   
		  //Creating Scanner object to accept user input 
		  Scanner confirm = new Scanner(System.in);
				
			
		   String idInput = confirm.nextLine();
		   
		   /*A conditional if else statement for the functioning of the account
		    *The conditionals below assess if the idNo entered by the 
		    * Client matches the clients IdNo and if not the loop stops
		    * If there is a match than it provides the client with two options
		    * Withdrawal or deposit
		    */
		   
		   
		   //Initial check if statement
		   if (ownerOne.getIdNo().equalsIgnoreCase(idInput)) {
			   
			  System.out.println("Welcome to SBV Bank");
			  
			  accountOne.checkBalance();
			  
			  System.out.println("What would you like to do next?");
			  System.out.println("Deposit press 1:");
			  System.out.println("Withdrawal press 2:");
			  
			  Scanner option = new Scanner(System.in);
			  
			  int choice = option.nextInt();
			  
			  /*nested if statement if the first statement evaluates to True
			   * choice 1 allows user to input deposit amount
			   * choice 2 allows user to insert withdrawal amount
			   */
			  
			  if(choice == 1) {
				  
				  System.out.println("Please enter amount to deposit");
				  
				  Scanner deposit = new Scanner(System.in);
				  
				  int depositAmount = deposit.nextInt();
				  
				  accountOne.deposit(depositAmount);
				  
				  accountOne.checkBalance();
				  
			  }
			  
			  else if(choice == 2) {
				  
                  System.out.println("Please enter amount to withdraw");
				  
				  Scanner withdraw = new Scanner(System.in);
				  
				  int withdrawAmount = withdraw.nextInt();
				  
				  if(withdrawAmount <= accountOne.balance) {
					  
					  accountOne.withdraw(withdrawAmount);
					  
					  accountOne.checkBalance(); 
				  }
				  
				  else {
					  
					  System.out.println("You are too broke to be trying to withdraw R"+ withdrawAmount);
				  }
				  
				  
				  
				  
			  }
			  
			  else {
				  System.out.println("Thanks for your time, do come back when you know what you want to do at the bank");
			  }
		   }
		   
		   else {
			   
			   System.out.println("You have entered an incorrect ID number please try again if the problem persists contact customer service");
			   
			   
		   }
		   
	System.out.println("Thank you for banking with SBV Bank the next time you return you wont find your cash");
	}

}


