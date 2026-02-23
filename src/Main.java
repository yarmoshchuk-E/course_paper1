import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //инициализируем объект класса EmployeeBook
        Employee employee1 = new Employee("николаев николай николаевич ", 5, 350);
        Employee employee2 = new Employee("иванов иван иваныч ", 3, 150);
        Employee employee3 = new Employee("петров петр петрович ", 4, 200);
        Employee employee4 = new Employee("семенов семен семенович ", 1, 450);
        Employee employee5 = new Employee("васечкин василий васильевич ", 4, 300);
        Employee employee6 = new Employee("аннушка разлила масло ", 4, 450);
        Employee employee7 = new Employee("пушкин александр сергеевич ", 3, 270);
        Employee employee8 = new Employee("деревянный буратино карлович ", 1, 170);
        Employee employee9 = new Employee("григорьев григорий григорьевич ", 2, 230);
        Employee employee10 = new Employee("антонов антон антонович ", 5, 310);
        Employee employee11 = new Employee("сергеев сергей сергеевич ", 2, 400);

        //заполняем через метод добавления нового сотрудника (вызываем 11 раз)
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
        System.out.println();
        //проверка вывода списка всех сотрудников со всеми данными о них
        EmployeeBook.listAllEmployees(EmployeeBook.getEmployees());
        System.out.println();
        //проверка метода подсчета средней зарплаты
        EmployeeBook.calculateAverageSalary(EmployeeBook.getEmployees());
        System.out.println();
        //проверка вывода значения налогов
        EmployeeBook.calculateTheTax("PROGRESSIVE");
        System.out.println();
        //индексируем зарплаты сотрудников 4-го отдела на 10%
        EmployeeBook.indexTheSalary(4, 10);
        System.out.println();
        //выводим первого сотрудника 4-го отдела с зарплатой выше 200
        EmployeeBook.printFirstEmployeeMaxSalary(4, 200);
        System.out.println();
        //выводим двух первых сотрудников 2-го отдела с зарплатой ниже 300
        EmployeeBook.getEmployeesSalaryLowWage(300, 2);
        System.out.println();
        //проверяем есть ли сотрудник в базе данных
        EmployeeBook.findEmployee(employee3);
        EmployeeBook.findEmployee(employee11);
        System.out.println();
        //получаем данные сотрудника по id
        EmployeeBook.getEmployeeThroughId(4);
    }
}