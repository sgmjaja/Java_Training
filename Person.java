package bankAccount;

public class Person {
	//Variables in the person class
	public String name;
	public String surname;
	public double height;
	public double weight;
	private String idNo;
	public String gender;
	
	//Constructor method for the person class
	public Person(
			String name,
			String surname,
			String idNo, 
			String gender, 
			double height,
			double weight
			) {
		
		this.name = name;
		this.surname =surname;
		this.idNo = idNo;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	//an empty constructor method for inheritance with Account holder class
	public Person() {
		
	}
	
	//Getter for IdNo
	public String getIdNo() {
		return idNo;
	}
	
	//Setter for IdNo
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	

}
