package com.bridgelabz.employeewage;

public class EmployeeWage {

    static int WAGE_PER_HOUR;
    static int HOURS_PER_DAY;
    static int PART_TIME_HOURS;
    static int DAYS_PER_MONTH;
    static int HOURS_PER_MONTH;

    static void empWageBuilder(){
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
    static void company1(){
        System.out.println("Employee Wage of company 1");
        WAGE_PER_HOUR = 30;
        HOURS_PER_DAY = 9;
        PART_TIME_HOURS = 5;
        DAYS_PER_MONTH = 21;
        HOURS_PER_MONTH = 189;
        empWageBuilder();
    }
    static void company2(){
        System.out.println("Employee Wage of company 2");
        WAGE_PER_HOUR = 25;
        HOURS_PER_DAY = 12;
        PART_TIME_HOURS = 6;
        DAYS_PER_MONTH = 24;
        HOURS_PER_MONTH = 288;
        empWageBuilder();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        company1();
        System.out.println();
        company2();
    }
}
