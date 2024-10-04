package day7;

public class Department {
    private int empid;
    private String deptname;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Department(int empid, String deptname) {
        this.empid = empid;
        this.deptname = deptname;
    }


    @Override
    public String toString() {
        return "Department{" +
                "empid=" + empid +
                ", deptname='" + deptname + '\'' +
                '}';
    }
}
