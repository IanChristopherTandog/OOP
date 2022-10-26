import java.util.Scanner;
public class RunBloodData{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	//	BloodData bd = new BloodData(bloodType, rhFactor);
		String input1;
		String input2;
		
		System.out.print("Enter blood of patient: ");
		input1 = sc.next();
		System.out.print("Enter the Rheseus factor (+ or -): " );
		input2 = sc.next();
		if (input1 == "A"){
			System.out.println(input1 + input2 + " is added to blood bank." );
		
		}
	}	
}