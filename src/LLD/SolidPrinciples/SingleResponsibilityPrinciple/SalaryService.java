package LLD.SolidPrinciples.SingleResponsibilityPrinciple;

class SalaryService {

    public double calculateSalary(EmployeeFollowSRP employee) {
        return employee.getSalary();
    }
}