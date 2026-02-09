import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;
    public static int idCount = 1;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCount++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public String toString() {
        return "сотрудник № " + getId() + " фио " + getFullName() + " отдел " + getDepartment() + " зарплата " + getSalary();
    }

    public void printShortInfo() {
        System.out.println("фио " + getFullName() + " зарплата " + getSalary());
    }


}