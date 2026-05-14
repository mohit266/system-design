package LLD.SingleResponsibilityPrinciple;

class EmployeeFollowSRP {

    private String name;
    private double salary;

    EmployeeFollowSRP(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}