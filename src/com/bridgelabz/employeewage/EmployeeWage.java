package com.bridgelabz.employeewage;

public class EmployeeWage {

    int WAGE_PER_HOUR;
    int HOURS_PER_DAY;
    int PART_TIME_HOURS;
    int DAYS_PER_MONTH;
    int HOURS_PER_MONTH;

    void empWageBuilder(){
        int hoursCount = 0;
        int monthlyWage = 0;
        int day = 1;
        while (hoursCount<=HOURS_PER_MONTH && day <= DAYS_PER_MONTH) {
            int employeeCheck = (int) (Math.random() * 10) % 3;
            int dailyWage = 0;
            System.out.println("Day " + day);
            switch (employeeCheck) {
                case 1:
                    System.out.println("Employee is present");
                    dailyWage = WAGE_PER_HOUR * HOURS_PER_DAY;
                    hoursCount += HOURS_PER_DAY;
                    break;
                case 2:
                    System.out.println("Employee is working Part time for day");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                    hoursCount += PART_TIME_HOURS;
                    break;
                default:
                    System.out.println("employee is absent");
            }
            monthlyWage += dailyWage;
            System.out.println("employee get the monthly wage till day " + day + " is " + monthlyWage);
            System.out.println("Hours till the day " + hoursCount);
            System.out.println();
            day++;
        }
        System.out.println();
        System.out.println("Working days in month " + (day - 1));
        System.out.println("Working hours in month " + hoursCount);
        System.out.println("employee get the monthly wage is " + monthlyWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        System.out.println("Total Employee wage of company1");
        EmployeeWage company1 = new EmployeeWage();
        company1.WAGE_PER_HOUR = 30;
        company1.HOURS_PER_DAY = 9;
        company1.PART_TIME_HOURS = 5;
        company1.DAYS_PER_MONTH = 21;
        company1.HOURS_PER_MONTH = 189;
        company1.empWageBuilder();
        System.out.println();
        System.out.println("Total Employee wage of company1");
        EmployeeWage company2 = new EmployeeWage();
        company2.WAGE_PER_HOUR = 25;
        company2.HOURS_PER_DAY = 12;
        company2.PART_TIME_HOURS = 6;
        company2.DAYS_PER_MONTH = 24;
        company2.HOURS_PER_MONTH = 288;
        company2.empWageBuilder();
    }
}
