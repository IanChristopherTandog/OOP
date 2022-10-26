import java.util.Scanner;
public class RunBloodData1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1,input2;
        String data;
        
        BloodData1 bd = new BloodData1();
        System.out.print("Enter blood type of patient:");
        
        input1 = sc.nextLine();
        bd.setBloodData(input1);
        
        System.out.print("Enter the Rhesus factor (+ or -):");
        input2 = sc.nextLine();
        bd.setRhFactor(input2);
        data = input1 + input2;
        
        if(data.isEmpty()){
            bd.setBloodData("O");
            bd.setRhFactor("+");
            
            System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the Blood Bank. ");
        }
        else if(data.equals("A+")||data.equals("A-")|| data.equals("B+")||data.equals("B-")||data.equals("AB+")||data.equals("AB-")||data.equals("O+")||data.equals("O-")){

			System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the Blood Bank. ");
        }
        else{
            System.out.println("Invalid input!");
        }
        sc.close();
    }
}