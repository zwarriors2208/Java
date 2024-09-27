package day3;

public class EmployeePortal{
    public static void main(String[] args) {
        Payroll payroll= new Payroll();

        SalariedEmployee se=new SalariedEmployee(345,"aaa",80000);
        payroll.displayGross(se);
        payroll.displayNet(se);

        Employee emps[] = new Employee[2];
        emps[0] = new SalariedEmployee(667,"ppp",50000); // Upcasting
        emps[1]=  new Manager(877,"sss",90000,10000);
        /*
        * CalculateGross() is defined in Employee and overridden in Salaried Employee
        * hence can be invoked using Employee reference emps[0]
         */
        payroll.displayGross(emps[0]);
        /* To invoke calculateNet() which is defined in SalariedEmployee
        * the Employee reference must be down casted to SalariedEmployee
        */
        SalariedEmployee ss =(SalariedEmployee)emps[0]; // down casting
        payroll.displayNet(ss);

        for (Employee e : emps)
        {
            payroll.displayGross(e);
            if (e instanceof Manager)
                ((Manager)e).displayAllowance();
        }
    }
}
