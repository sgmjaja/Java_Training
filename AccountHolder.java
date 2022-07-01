package bankAccount;

// Inheritance of the superclass attributes (Person Class) to the AccountHolder class
class AccountHolder extends Person {
	
	public String employmentStatus;
	private double monthlyIncome;

	
/*Creating a constructor method for the account holder class
 * With an implicit constructor for the superclass Person
 * the superclass constructor references the empty constructor in the
 * Person class 
 */
	public AccountHolder(
			String employmentStatus, 
			double monthlyIncome) {
		super();
		
		this.employmentStatus = employmentStatus;
		this.monthlyIncome = monthlyIncome;
		
	}
	
	


	//Getter for Monthly Income	
	public double getMonthlIcome() {
		return monthlyIncome;
	}
	
	//Setter for Monthly Income
	public void setMonthlIcome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	
	
	

}
