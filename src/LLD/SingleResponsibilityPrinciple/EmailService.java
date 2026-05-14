package LLD.SingleResponsibilityPrinciple;

class EmailService {

    public void sendEmail(EmployeeFollowSRP employee) {
        System.out.println("Email sent to " + employee.getName());
    }
}