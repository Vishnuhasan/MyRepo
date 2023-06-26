package archived;

public class GetEmployeeResponse {
    private int id;
    private String name;
    private int salary;
    private String departmentName;

    public GetEmployeeResponse() {
    }

    public GetEmployeeResponse(int id, String name, int salary, String departmentName) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentName = departmentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
