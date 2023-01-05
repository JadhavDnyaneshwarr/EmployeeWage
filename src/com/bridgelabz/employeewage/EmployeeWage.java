package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int HOURS_PER_DAY = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int employeecheck = (int) (Math.random() *10) %3;
        System.out.println(employeecheck);
        int dailyWage = 0;
        if (employeecheck==1){
            System.out.println("Employee is present");
            dailyWage = WAGE_PER_HOUR * HOURS_PER_DAY;
        } else if (employeecheck == 2) {
            System.out.println("Employee is working Half day");
            dailyWage = WAGE_PER_HOUR * (HOURS_PER_DAY / 2);
        } else{
            System.out.println("employee is absent");
        }
        System.out.println("employee get the daily wage is " + dailyWage);
    }
}
