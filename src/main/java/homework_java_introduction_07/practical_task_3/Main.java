package homework_java_introduction_07.practical_task_3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[6];

        employees[0] = new SalariedEmployee("EmpS1", "Alfredo", 12345.22, "UAIPN3453434125");
        employees[1] = new ContractEmployee("EmpC1", "Anrii", 55.66, 100, "UAIPN1234567899");
        employees[2] = new SalariedEmployee("EmpS2", "Julio", 7895.99, "UAIPN3453436699");
        employees[3] = new ContractEmployee("EmpC2", "Oleh", 75.11, 150, "UAIPN9996667878");
        employees[4] = new SalariedEmployee("EmpS3", "Maria", 5157.01, "UAIPN3458886548");
        employees[5] = new ContractEmployee("EmpC3", "Lyubov", 115.12, 68, "UAIPN1112223334");


        Arrays.sort(employees, new SalaryComparator());

        for (Employee employeeArr : employees) {
            System.out.println("Employee with Id: " + employeeArr.getEmployeeId() + " and with name: " + employeeArr.getName() + " get salary per month " + employeeArr.calculatePay() + "$");

            if (employeeArr instanceof SalariedEmployee) {
                SalariedEmployee salaried = (SalariedEmployee) employeeArr;
                System.out.print("Employee " + employeeArr.getName() + " have social security number: " + salaried.getSocialSecurityNumber());
            } else if (employeeArr instanceof ContractEmployee) {
                ContractEmployee contract = (ContractEmployee) employeeArr;
                System.out.print("Employee " + employeeArr.getName() + " have federal tax ID: " + contract.getFederalTaxIdMember());
            }
            System.out.println("\n");
        }
    }


    public static class SalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o2.calculatePay(), o1.calculatePay());
        }
    }
}
