public class EmployeCase2 {
	public static void main (String[]  args) {
	
		int attendance = (int) (Math.floor(Math.random() *10) %2);
		double emploe_wage;
		int hours = 8;
		int pay = 20;
		
		if (attendance == 1){
			System.out.println("employe is present");
			emploe_wage = hours * pay; 
			System.out.println("emloye wage is " + emploe_wage);	

		}
		else{
			System.out.println("employe is absent");
		} 
	}
}

