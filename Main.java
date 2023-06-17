package school_managment_system;

	import java.util.List;
	import java.util.ArrayList;

	public class Main {

		public static void main(String[] args) {
			Teacher lilly = new Teacher(111,"lilly",20000);
			Teacher alexa = new Teacher(112,"alexa",20000);

			//List<Teacher> teacherList = new ArrayList<>();
			List<Teacher> teacherList = new ArrayList();
			teacherList.add(alexa);
			teacherList.add(lilly);
			
			
			Student jhon = new Student(001,"jhon",5);
			Student robin = new Student(002,"robin",5);
			
			//List<Student> studentList = new ArrayList<>();
			List<Student> studentList = new ArrayList();
			studentList.add(jhon);
			studentList.add(robin);
			
			
			School mct = new School(teacherList,studentList);
			//System.out.println("MCT earned this month: "+mct.getTotEarned()+"$");
			
		//    robin.payFees(50000);
		    //System.out.println("MCT earned "+mct.getTotEarned()+"$");
		    
		//   lilly.receivedSalary(lilly.getSalary());
		    
		    //System.out.println(lilly);
		    System.out.println(teacherList);
	        System.out.println("\n"+studentList);
//		    System.out.println( mct.getTotEarned());
//		    System.out.println(mct.getTotSpent());
		   
		   
		   
			
		}

	}



