import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(" николаев николай николаевич ", 5, 350);
        Employee employee2 = new Employee(" иванов иван иваныч ", 3, 150);
        Employee employee3 = new Employee(" петров петр петрович ", 4, 200);
        Employee employee4 = new Employee(" семенов семен семенович ", 1, 450);
        Employee employee5 = new Employee(" васечкин василий васильевич ", 4, 300);
        Employee employee6 = new Employee(" аннушка разлила масло ",4,450);
        Employee employee7 = new Employee(" пушкин александр сергеевич ", 3, 270);
        Employee employee8 = new Employee(" деревянный буратино карлович ", 1, 170);
        Employee employee9 = new Employee(" григорьев григорий григорьевич ", 2, 230);
        Employee employee10 = new Employee(" антонов антон антонович ", 5, 310);
        Employee employee11 = new Employee(" сергеев сергей сергеевич ", 2, 400);


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
        EmployeeBook.addToArray(employee6);
        EmployeeBook.addToArray(employee7);
        EmployeeBook.addToArray(employee8);
        EmployeeBook.addToArray(employee9);
        EmployeeBook.addToArray(employee10);
        EmployeeBook.addToArray(employee11);


        EmployeeBook.listAllEmployees(EmployeeBook.getEmployees());

        EmployeeBook.calculateAverageSalary(EmployeeBook.getEmployees());

        EmployeeBook.calculateTheTax(EmployeeBook.getEmployees());

        EmployeeBook.indexTheSalary(4,10);

        EmployeeBook.printFirstEmployeeMaxSalary(4,200);

        EmployeeBook.getEmployeesSalaryLowWage(300,2);

        EmployeeBook.findEmployee(employee3);
        EmployeeBook.findEmployee(employee11);

        EmployeeBook.getEmployeeThroughId(4);

    }
}