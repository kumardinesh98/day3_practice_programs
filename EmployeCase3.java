public class EmployeCase3 {
	public static void main (String[]  args) {
	
		int attendance = (int) (Math.floor(Math.random() *10) %3);
		double emploe_wage;
		int hours = 8;
		int part_time=4;
		int pay = 20;
		
		if (attendance == 1){
			System.out.println("employe is present");
			emploe_wage = hours * pay; 
			System.out.println("emloye wage is " + emploe_wage);	

		}

		else if (attendance == 2){
			System.out.println("employe is present part time");
			emploe_wage = part_time * pay; 
			System.out.println("emloye wage is " + emploe_wage);	

		}

		else{
			System.out.println("employe is absent");
		} 
	}
}

