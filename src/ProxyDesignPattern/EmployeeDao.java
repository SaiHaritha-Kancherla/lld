package ProxyDesignPattern;

public interface EmployeeDao {
    public void createEmployee(String role,Employee employee );
    public Employee getEmployee(String role, int empId);
    public void getWebsite(String role);
}
