package StreamInterview;

public class Employee {
    private String name;
    private Department department;
    private int age;
    private double salary;

    public Employee(String name, Department department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public Department getDepartment() { return department; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + department.getDepartmentName() + ", " + salary + ")";
    }
}