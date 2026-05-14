package lld.SingleResponsibilityPrinciple;

public class Main {

    public static void main(String[] args) {

        EmployeeFollowSRP emp = new EmployeeFollowSRP("Mohit", 50000);

        SalaryService salaryService = new SalaryService();
        EmployeeRepository repository = new EmployeeRepository();
        EmailService emailService = new EmailService();

        System.out.println(
                salaryService.calculateSalary(emp)
        );

        repository.save(emp);

        emailService.sendEmail(emp);
    }
}