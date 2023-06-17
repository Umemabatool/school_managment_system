package school_managment_system;


/**
 * 
 * this class is responsible for keeping the track of stundent's id, name, grade,
 * Total fees of the month that should student has to pay and the fees he has paid, 
 * once the fees get paid it gives a message the you fees is paid successfully for this month.  
 *
 */

public class Student {

	private int Id;
	private String name;
	private int grade;
	private int feesTotal;
	private int feesPaid;
	
	/**
	 * 	this is the student class argument constructor so when the object is made it can be called with the below parameters,
	 * it creates a new student object
	 * here the Total fees is 50000 (constant) and initial fee is 0
	 * @param Id for the student id unique
	 * @param name for the name of student 
	 * @param grade for the grade of student
	 */
	
	public Student( int Id , String name , int grade) {
		
		feesTotal = 50000;
		feesPaid = 0;
		this.Id = Id;
		this.name = name;
		this.grade = grade;
		
	}
	
	// Not going to alter student's name and student's id

	/**
	 * used to update the students grade
	 * @param grade new grade for the student
	 */
	
	public void setGrade (int grade) {
		this.grade = grade;
		
	}
	

	//to get student's id
	public int getId() {
		return Id;
	}

	//to get student's name	
	public String getName() {
		return name;
	}

	//to get student's grade	
	public int getGrade() {
		return grade;
	}

	//to get student's total fees	
	public int getFeesTotal() {
		return feesTotal;
	}

	//to get student's paid fees
	public int getFeesPaid() {
		return feesPaid;
	}

	public void payFees(int fees) {
	    if (fees < 0) {
	        System.out.println("Error: Invalid fees amount. Fees cannot be negative.");
	        return;
	    }
	    
	    if (feesPaid + fees > feesTotal) {
	        System.out.println("Error: Fees paid exceeds total fees. Unable to process the payment.");
	        return;
	    }
	    
	    feesPaid += fees;
	    School.updateEarned(feesPaid);
	    System.out.println("Fees paid successfully.");
	}

	/**
	 * used to update the students fees
	 * @param fees the fee student pays
	 */
	
	public void updateFees(int fees ){
		feesPaid += feesPaid+fees;
	}

	@Override
	public String toString() {
		return "Student's Id:" + getId() + "\nStudent's Name: " + getName() + "\nStudent's Gade: " + getGrade()
				+ "\nStudent's Total fees: " + getFeesTotal() +"$"+ "\nStudent's Paid fees: " + getFeesPaid() + "$";
	}
	


}

