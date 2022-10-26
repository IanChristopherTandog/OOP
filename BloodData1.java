class BloodData1{
	private String bloodType;
	private String rhFactor;
		
	public void setBloodData(String bloodType){
		this.bloodType = bloodType;
	}
	public void setRhFactor(String rhFactor){
		this.rhFactor = rhFactor;
	}
	public String getBloodType(){
		return this.bloodType;
	}
	public String getRhFactor(){
		return this.rhFactor;
	}
	public void display(){
		System.out.println(bloodType+rhFactor+"System is added to the blood bank.");
	}	
}