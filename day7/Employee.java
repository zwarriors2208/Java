package day7;

import java.util.Set;

public class Employee {
    private int empid;
    private String name;
    private int salary;
    private Set<String> skillset;
    private String department;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<String> getSkillset() {
        return skillset;
    }

    public void setSkillset(Set<String> skillset) {
        this.skillset = skillset;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int empid, String name, int salary, Set<String> skillset, String department) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.skillset = skillset;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skillset=" + skillset +
                ", department='" + department + '\'' +
                '}';
    }
}
