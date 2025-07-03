package homework_java_introduction_07.practical_task_3;

public class SalariedEmployee extends Employee {

    private double fixedMonthlyPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
