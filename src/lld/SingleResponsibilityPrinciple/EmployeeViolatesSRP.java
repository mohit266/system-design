package lld.SingleResponsibilityPrinciple;

class EmployeeViolatesSRP {

    private String name;
    private double salary;

    EmployeeViolatesSRP(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public void saveToDatabase() {
        System.out.println("Employee saved to database");
    }

    public void sendEmail() {
        System.out.println("Email sent to employee");
    }
}