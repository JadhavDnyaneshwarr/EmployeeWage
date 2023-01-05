package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int HOURS_PER_DAY = 8;
    static final int PART_TIME_HOURS = 8;
    static final int DAYS_PER_MONTH = 20;
    static final int HOURS_PER_MONTH = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int hoursscount = 0;
        int monthlywage = 0;
        int day = 1;
        while (hoursscount<=HOURS_PER_MONTH && day <= DAYS_PER_MONTH) {
            int employeecheck = (int) (Math.random() * 10) % 3;
            int dailyWage = 0;
            System.out.println(day);
            switch (employeecheck) {
                case 1:
                    System.out.println("Employee is present");
                    dailyWage = WAGE_PER_HOUR * HOURS_PER_DAY;
                    hoursscount += HOURS_PER_DAY;
                    break;

                case 2:
                    System.out.println("Employee is working Part time for day");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                    hoursscount += PART_TIME_HOURS;
                    break;
                default:
                    System.out.println("employee is absent");
            }
            monthlywage += dailyWage;
            day++;
            System.out.println("employee get the monthly wage til th day " + day + " is " + monthlywage);
            System.out.println("Hours till the day " + hoursscount);
            System.out.println();
        }
        System.out.println();
        System.out.println("Working days in month " + day);
        System.out.println("Working hours in month " + hoursscount);
        System.out.println("employee get the monthly wage is " + monthlywage);
    }
}
