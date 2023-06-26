package archived;

public class UpdateEmployeeRequest {
    private String name;
    private int salary;
    private String departmentName;

    public UpdateEmployeeRequest() {
    }

    public UpdateEmployeeRequest( String name, int salary, String departmentName) {
        this.name = name;
        this.salary = salary;
        this.departmentName = departmentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
