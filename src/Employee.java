import java.util.Objects;

//создаю класс с ФИО, номером отдела и зарплатой сотрудников
public class Employee {
    private String fullName;
    private int department;
    private int salary;
    //добавляю статическую переменную-счётчик и поле, отвечающие за уникальный id сотрудника
    private int id;
    public static int idCount = 1;

    //создаю конструктор
    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCount++;
    }

    //геттеры для всех полей и сеттеры для полей отдела и зарплаты
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

    //переопределяю метод equals для сравнения сотрудников по ФИО и зарплате
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    //переопределяю toString для вывода полной и краткой информации о сотруднике
    @Override
    public String toString() {
        return "сотрудник № " + getId() + " ФИО: " + getFullName() + " отдел: " + getDepartment() + " зарплата: " + getSalary();
    }

    public void printShortInfo() {
        System.out.println("ФИО: " + getFullName() + " зарплата: " + getSalary());
    }
}