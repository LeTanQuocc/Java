package assignment11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Emp_FullTime extends EMPLOYEE {

    private double coeffcients_salary;

    public Emp_FullTime(double coeffcients_salary, String EmpId, String EmpName, Date EmdateOfBirth, Date StartDate) {
        super(EmpId, EmpName, EmdateOfBirth, StartDate);
        this.coeffcients_salary = coeffcients_salary;
    }

    public Emp_FullTime() {
    }

    public double getCoeffcients_salary() {
        return coeffcients_salary;
    }

    public void setCoeffcients_salary(double coeffcients_salary) {
        this.coeffcients_salary = coeffcients_salary;
    }

    @Override
    public void Output() {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/");
        System.out.println("-----Out-----");
        System.out.println("EmpId: "+this.getEmpId());
        System.out.println("EmpName: "+this.getEmpName());
        System.out.println("EmpDateOfBirth: "+date.format(this.getEmdateOfBirth()));
        System.out.println("StartDate: "+date.format(this.getStartDate()));
        System.out.println("coeffcients_salary: "+this.getCoeffcients_salary());

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

        System.out.println("Nhap coeffcients_salary: ");
        double coeffcients_salary = scan.nextDouble();
        setCoeffcients_salary(coeffcients_salary);

    }

    @Override
    public double calculateSalary() {
        return Basic_Salary * this.coeffcients_salary  + calculateAllowance();
    }

    @Override
    public double calculateAllowance() {
        int seniority = CalculateSeniority();
        if( seniority >= 10 ){
            return 1000000;
        } else{
            return 500000;
        }
    }

}
