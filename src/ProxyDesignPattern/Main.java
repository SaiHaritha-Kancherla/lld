package ProxyDesignPattern;

public class Main {
    public static void main(String[] args)
    {
        EmployeeDao employeeDao=new EmployeeImplDaoProxy();
        Employee employee=new Employee("haritha", 1, 100000);
        employeeDao.createEmployee("ADMIN", employee);
        employeeDao.getEmployee("BUSINESS_USER", employee.getEmployeeId());
        employeeDao.getWebsite("CONSULTANT");

        employeeDao.createEmployee("CONSULTANT", employee);
        employeeDao.getEmployee("CONSULTANT", employee.getEmployeeId());
        employeeDao.getWebsite("GUEST");
    }
}
