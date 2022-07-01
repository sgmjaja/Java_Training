package bankAccount;
public class BankAccount {
  
  int balance;
  String accountType;
  
  
  public BankAccount(int initialBalance, String accountType){
    balance = initialBalance;
    this.accountType = accountType;
  }

  public void checkBalance() {
      System.out.println("Your balance is "+ balance);
  }

  public void deposit(int amountToDeposit) {
    int newAmount = amountToDeposit + balance;
    balance = newAmount;
    System.out.println("You just deposited " + amountToDeposit);
  }

  public int withdraw(int amountToWithdraw) {
    int newBalance = balance - amountToWithdraw;
    balance = newBalance;
    System.out.println("You just withdrew " + amountToWithdraw);

    return(amountToWithdraw);
  }
  
}
  
 