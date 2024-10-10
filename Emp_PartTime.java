package assignment11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Emp_PartTime extends EMPLOYEE {

    private int number_of_workdays;

    public Emp_PartTime() {
    }

    public Emp_PartTime(int number_of_workdays) {
        this.number_of_workdays = number_of_workdays;
    }

    public int getNumber_of_workdays() {
        return number_of_workdays;
    }

    public void setNumber_of_workdays(int number_of_workdays) {
        this.number_of_workdays = number_of_workdays;
    }

    @Override
    public void Output() {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/");
        System.out.println("-----Out-----");
        System.out.println("EmpId: " + this.getEmpId());
        System.out.println("EmpName: " + this.getEmpName());
        System.out.println("EmpDateOfBirth: " + date.format(this.getEmdateOfBirth()));
        System.out.println("StartDate: " + date.format(this.getStartDate()));
        System.out.println("number_of_workdays: " + this.getNumber_of_workdays());
    }

    @Override
    public void Input() {
        System.out.println("-----Nhap-----");
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap EmpID: ");
        String EmpID = scan.nextLine();
        setEmpId(EmpID);

        System.out.println("Nhap EmpName: ");
        String EmpName = scan.nextLine();
        setEmpName(EmpName);

        System.out.println("Nhap EmpDateOfBirth: ");
        String EmpDateOfBirthString = scan.nextLine();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date EmpDateOfBirth = date.parse(EmpDateOfBirthString);
            setEmdateOfBirth(EmpDateOfBirth);
        } catch (Exception e) {
            System.out.println("Error......");
        }

        System.out.println("Nhap StartDate: ");
        String StartDateString = scan.nextLine();
        SimpleDateFormat Datee = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date StartDate = Datee.parse(StartDateString);
            setEmdateOfBirth(StartDate);
        } catch (Exception e) {
            System.out.println("Error......");
        }

        System.out.println("Nhap number_of_workdays: ");
        int number_of_workdays = scan.nextInt();
        setNumber_of_workdays(number_of_workdays);
    }

    @Override
    public double calculateSalary() {
        return Basic_Salary * this.number_of_workdays / 26 + calculateAllowance();
    }

    @Override
    public double calculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 1000000;
        } else {
            return 500000     ;
        }
    }

}
