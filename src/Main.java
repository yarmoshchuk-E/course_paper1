import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(" николаев николай николаевич ", 5, 350);
        Employee employee2 = new Employee(" иванов иван иваныч ", 3, 150);
        Employee employee3 = new Employee(" петров петр петрович ", 4, 200);
        Employee employee4 = new Employee(" семенов семен семенович ", 1, 450);
        Employee employee5 = new Employee(" васечкин василий васильевич ", 2, 300);

        System.out.println(employee1);
        employee1.printShortInfo();
        System.out.println(employee2);
        System.out.println(employee3);
        employee3.printShortInfo();

        EmployeeBook.addToArray(employee1);
        EmployeeBook.addToArray(employee2);
        EmployeeBook.addToArray(employee3);
        EmployeeBook.addToArray(employee4);
        EmployeeBook.addToArray(employee5);
        EmployeeBook.listAllEmployees(EmployeeBook.getEmployees());

        EmployeeBook.calculateAverageSalary(EmployeeBook.getEmployees());

        EmployeeBook.calculateTheTax(EmployeeBook.getEmployees());

    }
}