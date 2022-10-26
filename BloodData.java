public class BloodData{
	
private static String bloodType ; 
private static String rhFactor; 

public BloodData()
{
    bloodType = "O";
    rhFactor = "+";
}
public BloodData(String bt, String rh) 
{ 
    this.bloodType = bt;
    this.rhFactor = rh; 
} 
public void display(){
	System.out.println(bloodType);
	System.out.println(rhFactor);
	
	}
}