package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        //double x = Math.random();
        //double y = x *10;
        //double z = y%2;
        //int employeecheck = (int) z;
        int employeecheck = (int) (Math.random() *10) %2;
        System.out.println(employeecheck);
        if (employeecheck==1){
            System.out.println("Employee is present");
        }else{
            System.out.println("employee is absent");
        }
    }
}
