package school_managment_system;

	/**
	 * * this class is responsible for keeping the track of teacher's id, name and salary
	 */

public class Teacher {

		private int Id;
		private String name;
		private int salary;
		private int salaryEarned;
		
		
	/**
		 * creates a new teacher object
		 * @param Id for the teacher 
		 * @param name of the teacher
		 * @param salary of the teacher
	 */
		
		public Teacher(int Id, String name, int salary) {
			
			this.Id = Id;
			this.name = name;
			this.salary = salary;
			this.salaryEarned = 0;
		}
		
	    //to get teacher's Id
		public int getId() {
			return this.Id;
		}
		
		//to get teacher's name	
		public String getName() {
			return this.name;
		}
		
		//to get teacher's current salary	
		public int getSalary() {
			return this.salary;
		}
		
		//to set teacher's updated salary 	
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		//add the new salary into salary earned


		@Override
		public String toString() {
			return "Teacher's ID: " + getId() + "\nTeacher's Name:  " + getName() + "\nTeacher's salary: " + getSalary() +"$";
		}
		
		
		public void receivedSalary(int salary) {
		    if (salary < 0) {
		        System.out.println("Error: Invalid salary amount. Salary cannot be negative.");
		        return;
		    }
		    
		    salaryEarned += salary;
		    School.updateSpent(salary);
		    System.out.println("Salary received successfully.");
		}

			
		
	}


