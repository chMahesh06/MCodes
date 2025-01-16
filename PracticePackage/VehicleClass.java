package PracticePackage;

public class VehicleClass extends ExAnbstract { 
	
	 public static void main(String[] args) {
		 
		 VehicleClass obj= new VehicleClass();
		 obj.bike();
		 obj.scooty();
		 obj.car();
		 
		
	}

	@Override
	void scooty() {
		System.out.println("this is scooty method");
		
		
		
	}

}
