package assignment11;

import java.util.Date;

public abstract class EMPLOYEE implements IEMPLOYEE {

    private String EmpId;
    private String EmpName;
    private Date EmdateOfBirth;
    private Date StartDate;

    public EMPLOYEE(String EmpId, String EmpName, Date EmdateOfBirth, Date StartDate) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmdateOfBirth = EmdateOfBirth;
        this.StartDate = StartDate;
    }

    public EMPLOYEE() {
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public Date getEmdateOfBirth() {
        return EmdateOfBirth;
    }

    public void setEmdateOfBirth(Date EmdateOfBirth) {
        this.EmdateOfBirth = EmdateOfBirth;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public void Input() {

    }

    public void Output() {

    }

    public int CalculateSeniority() {
        return 0;
    }

}
