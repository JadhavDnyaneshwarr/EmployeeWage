package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int HOURS_PER_DAY = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int employeecheck = (int) (Math.random() *10) %3;
        System.out.println(employeecheck);
        int dailyWage = 0;
        switch (employeecheck){
            case 1:
                System.out.println("Employee is present");
                dailyWage = WAGE_PER_HOUR * HOURS_PER_DAY;
                break;

            case 2:
                System.out.println("Employee is working Half day");
                dailyWage = WAGE_PER_HOUR * (HOURS_PER_DAY / 2);
                break;

            default:
                System.out.println("employee is absent");
        }
        System.out.println("employee get the daily wage is " + dailyWage);
    }
}
