package ProxyDesignPattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class Employee {
    private String employeeName;
    private int employeeId;
    private long salary;

    public Employee(String employeeName, int employeeId, long salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }
}
