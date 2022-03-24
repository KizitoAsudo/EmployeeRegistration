import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kizito Asudo
 */

 /**
  * EmployeeList
  */

  class EmployeeList {
	String[] employees={"Kizito Asudo","John Doe","Idriss Shulu"};
	public void getEmployeeList(){
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]+"\n");
		}
	}
 }

class EmployeeData extends EmployeeList
{
	
	public String employeeFullName="Kizito Asudo";
	public int employeeAge=22;
	public float employeeWage=41000;

	@Override
	public void getEmployeeList(){
		for (int i = 0; i < super.employees.length; i++) {
			System.out.println(super.employees[i]+"\n");
		}
	}

	 public void displayEmployeeData(String query) {
		 switch (query) {
			 case "Kizito Asudo":
			 employeeAge=22;
			 employeeFullName="Kizito Asudo";
			 employeeWage=41000;
				 break;
			case "Idriss Shulu":
			employeeAge=12;
			employeeFullName="Idriss Shulu";
			employeeWage=11000;
				 break;
			case "John Doe":
			employeeAge=62;
			employeeFullName="John Doe";
			employeeWage=420000;
				 break;
		 
			 
		 }
		 /* if (query=="Kizito Asudo") {
			 employeeAge=22;
			 employeeFullName="Kizito Asudo";
			 employeeWage=41000;
		 } else if (query=="John Doe") {
			employeeAge=62;
			employeeFullName="John Doe";
			employeeWage=420000;
		 }else if (query=="Idriss Shulu"){
			employeeAge=12;
			 employeeFullName="Idriss Shulu";
			 employeeWage=11000;
		 } */
		System.out.println("Employee Name: "+employeeFullName+"\nEmployeeAge: "+""+employeeAge+"\nEmployeeWage: "+employeeWage);
	  }
}