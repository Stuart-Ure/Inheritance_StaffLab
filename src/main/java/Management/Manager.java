package Management;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;


    public Manager(String name, String NiNumber, double salary, String deptName) {
        super(name, NiNumber, salary);
        this.deptName = deptName;
    }
    public String getDeptName() {
        return deptName;
    }

}
