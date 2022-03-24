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

import java.util.Scanner;

public class main extends EmployeeData{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        EmployeeData employeeInfo=new EmployeeData();
        int ans;

        System.out.println("-------Welcome to the Employee System--------\n1. Get employee list\n2. Get employee details");
        
        ans=input.nextInt();
        switch (ans) {
            case 1:
                employeeInfo.getEmployeeList();
                break;
            case 2:
                System.out.println("Enter employee name: ");
                String employeeQuery=input.next();
                employeeInfo.displayEmployeeData(employeeQuery);
                break;
            default:
                break;
        }


        
    }
}
