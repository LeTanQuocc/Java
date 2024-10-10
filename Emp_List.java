package assignment11;

import java.util.ArrayList;

public class Emp_List {

    private ArrayList<EMPLOYEE> list;

    public Emp_List(ArrayList<EMPLOYEE> list) {
        this.list = list;
    }

    public Emp_List() {
        this.list = new ArrayList<>();
    }

    public void AddNew(EMPLOYEE eml) {
        list.add(eml);
    }

    public void update(String EmpID) {
        for (EMPLOYEE update : this.list) {
            if (update.getEmpId().equals(EmpID)) {
                update.Input();
                return;
            }
        }
        System.out.println("Khong ton tai id");
    }

    public void delete(String EmpID) {
        for (int i = 0; i <= list.size(); i++) {
            if (list.get(i).getEmpId().equals(EmpID)) {
                list.remove(i);
            }
        }
    }

    public EMPLOYEE find(EMPLOYEE EmpID) {
        for (EMPLOYEE emp : this.list) {
            if (emp.getEmpId().equals(EmpID)) {
                return emp;
            }
        }
        return null;

    }
    
    public void displayAll(){
        for(EMPLOYEE emp : this.list){
            emp.Output();
        }
    }

}
