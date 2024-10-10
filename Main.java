package assignment11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Emp_List EL = new Emp_List();
        Scanner n = new Scanner(System.in);
        String check;
        do {
            System.out.println("-----Menu-----"
                    + "\n1.Add New Employee Full Time"
                    + "\n2.Add New Employee Part Time"
                    + "\n3.Add Update Employee"
                    + "\n4.Add Delete Employee"
                    + "\n5.Add Find Employe"
                    + "\n6.Display Employee"
                   
            );
            System.out.print("Nhap lua chon: ");
            int choice = n.nextInt();
            n.nextLine();

            switch (choice) {
                case 1:

                    Emp_FullTime fullTimeEmployee = new Emp_FullTime();
                    fullTimeEmployee.Input();
                    EL.AddNew(fullTimeEmployee);
                    break;

                case 2:

                    Emp_PartTime partTimeEmployee = new Emp_PartTime();
                    partTimeEmployee.Input();
                    EL.AddNew(partTimeEmployee);
                    break;

                case 3:

                    System.out.print("Nhap id de update: ");
                    String updateId = n.nextLine();
                    EL.update(updateId);
                    break;

                case 4:
                    
                    System.out.print("Nhap id de xoa: ");
                    String deleteId = n.nextLine();
                    EL.delete(deleteId);
                    break;

                case 5:
                    System.out.println("find id: ");
                    String findid = n.nextLine();
                    EL.delete(findid);
                    
                    break;

                case 6:

                    EL.displayAll();
                    break;

                default:
                    System.out.println("Lua chon khong dung. Moi nhap lai.");
            }

            System.out.print("Nhap y de tiep tuc ");
            check = n.nextLine();
        } while (check.equals("y"));
        n.close();
    }
}
