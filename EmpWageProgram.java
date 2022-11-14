package bl.com.day9;

import java.util.Random;

public class  EmpWageProgram  {
	
	public static void main(String[] args) {
		System.out.println("--Welcome to Employee Wage Computation Program--\n");
		
	   String attendanceString =  EmpWageProgram.checkAttendance();
	    System.out.println(attendanceString);
	    checkAttendance() ;

	    System.out.println("Employee's today wage :" +getDailyWage(attendanceString));
	}

	  private static String checkAttendance() {
	    Random random = new Random();
	    boolean randomBool = random.nextBoolean();
	    
		int randomNum = 1;
		if(randomNum == 1) return "employee is Present full time";
	    else if (randomNum == 2) return "employee is present part time";

	    if (randomBool) return "Employee is present.";
	    else return "Employee is absent.";
	}
	  
	private static int getDailyWage(String str) {
		
		boolean isPresent = str.contains("present") || str.contains("present");
		
		byte empRatePerHr = 20;
		byte hrsWorked = 0;
		byte fullTimeHrs = 8;
		byte partTimeHrs = 4;
		
		if(str.contains("full time")) hrsWorked = fullTimeHrs;
		else if(str.contains("part time")) hrsWorked = partTimeHrs;
		
		//if (isPresent) hrsWorked = 8;
		int dailyWage = empRatePerHr * hrsWorked;
		return dailyWage;
	}
}