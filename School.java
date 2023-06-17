package school_managment_system;

import java.util.List;

	/**
	 * many teachers many students
	 * implements new teachers and students using an array List
	 */

	public class School {

		private List<Teacher> teachers;
		private List<Student> students;
		private static int totEarned;
		private static int totSpent;
		
		/**
		 * new school object is created 
		 * @param teachers list of teachers in the school 
		 * @param students list of students in the school 
		 */
		
		public School(List<Teacher> teachers, List<Student> students) {
			this.teachers = teachers;
			this.students = students;
			totEarned = 0;
			totSpent = 0;
			
			
		}

		// @return the list of teachers in the school 
		public List<Teacher> getTeachers() {
			return teachers;
		}

		// @return the list of students in the school 
		public List<Student> getStudents() {
			return students;
		}

		// @return the money that school earned 
		public int getTotEarned() {
		    System.out.println("Calculating total earned from student fees...");
		    return totEarned;
		}
		
		// @return the money that school spent 
		public int getTotSpent() {
		    System.out.println("Calculating total spent on teacher salaries...");
		    return totSpent;
		}

		//@param add teachers to the school 
		public void addTeachers(Teacher teacher) {
		    if (!teachers.contains(teacher)) {
		        teachers.add(teacher);
		        System.out.println("Teacher added to the school.");
		    } else {
		        System.out.println("Error: Teacher already exists in the school.");
		    }
		}
		 
		
		 //@param add students to the school 
		public void addStudents(Student student) {
		    if (!students.contains(student)) {
		        students.add(student);
		        System.out.println("Student added to the school.");
		    } else {
		        System.out.println("Error: Student already exists in the school.");
		    }
		}
		
		 //@param add total money that school earned 
		public static void updateEarned(int earned) {
			totEarned += earned;
		}

//		 //@param update the money that spend by school 
//		public static void updateSpent(int spent) {
//			totSpent -= spent;
//		}

		// @param update the money that is spent by the school
		public static void updateSpent(int spent) {
		    if (spent <= totEarned) {
		        totSpent += spent;
		        totEarned -= spent;
		        System.out.println("Money spent successfully. Amount spent on giving salary to the teachers: $" + spent);
		    } else {
		        System.out.println("Error: Insufficient funds. Cannot spend more than the total earned amount.");
		    }
		}


	}



