package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void createEmployee(String role, Employee employee) {
        System.out.println(" creating an employee"+ employee.toString());
    }

    @Override
    public Employee getEmployee(String role, int empId) {
        System.out.println(" getting employee details by empid"+ empId);
        return null;
    }

    @Override
    public void getWebsite(String role) {
        System.out.println(" welcome user!!!");
    }
}
