public class EmployeCase6 {
	final static int is_present=1;
	final static int is_part_time=2;
	
	public static void main (String[]  args) {
		int work_hours=0;
		int days=0;
		while (work_hours<100 && days<=20){
			days+=1;
			int attendance=(int) (Math.floor(Math.random() *10) %3);
			switch (attendance) {
				case is_present:
					work_hours +=8;
					break;
				
				case is_part_time:
					work_hours+=4;
					break;
				
				default:
					work_hours +=0;
					break;
				}
		}
		double employ_salary=work_hours*20;
		
		System.out.println("total wages is "+employ_salary);	
		System.out.println("total hours "+work_hours);
		System.out.println("total days "+days);
			
		
				
				
	 	}	
	}	
