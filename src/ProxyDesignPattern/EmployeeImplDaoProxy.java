package ProxyDesignPattern;

public class EmployeeImplDaoProxy implements  EmployeeDao{
    EmployeeDaoImpl employeeDaoImpl;
    public EmployeeImplDaoProxy()
    {
        this.employeeDaoImpl=new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String role, Employee employee) {
        if(role.equals("ADMIN"))
        {
            this.employeeDaoImpl.createEmployee(role, employee);
        }
        else
        {
            System.out.println("U cant create a user, only an admin can cretae a user");
        }
    }

    @Override
    public Employee getEmployee(String role, int empId) {
        if(role.equals("BUSINESS_USER") || role.equals("ADMIN"))
        {
            return this.employeeDaoImpl.getEmployee(role, empId);
        }
        System.out.println("Employee details are only available to business user or above roles");
        return null;
    }

    @Override
    public void getWebsite(String role) {
        if(role.equals("CONSULTANT") || role.equals("BUSINESS_USER") || role.equals("ADMIN"))
        {
            this.employeeDaoImpl.getWebsite(role);
        }
        else
        {
            System.out.println("Employee details are only available to consultant or above roles");
        }
    }
}
