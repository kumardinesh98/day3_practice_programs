public class EmployeCase1 {
	public static void main (String[]  args) {
	
		int attendance = (int) (Math.floor(Math.random() *10) %2);
		
		if (attendance == 1){
			System.out.println("employe is present");	
		}
		else{
			System.out.println("employe is absent");
		} 
	}
}
