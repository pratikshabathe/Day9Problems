package bl.com.day9;

import java.util.Random;

public class  EmpWageProgram  {
	
	public static void main(String[] args) {
		System.out.println("--Welcome to Employee Wage Computation Program--\n");
		
	   String attendanceString =  EmpWageProgram.checkAttendance();
	    System.out.println(attendanceString);
	    checkAttendance() ;
	    
	    System.out.println("Employee's today's wage :" + getDailyWage(attendanceString));

	}

	  private static String checkAttendance() {
	    Random random = new Random();
	    int randomBool = random.nextInt();

	    int randomNum = 0;
		switch(randomNum) {
	    case 1:
	    	return "employee is present full time";
	    
	    case 2:
	    	return "employee is present part time";
	    	
	    default :
	    	return " employee is absent";
	    			
	    }

	}
	  
	  private static int getDailyWage(String str) {
		  
		  Byte empRatePerHr = 20;
		  Byte hrsWorked = 0;
		  Byte fullTimeHrs = 8;
		  Byte partTimeHrs = 4;
		  
		  if(str.contains("full time")) hrsWorked = fullTimeHrs;
		  else if(str.contains("part time")) hrsWorked = partTimeHrs;
		  
		  int dailyWage = empRatePerHr*hrsWorked;
		  return dailyWage;
		  
	  }
}
