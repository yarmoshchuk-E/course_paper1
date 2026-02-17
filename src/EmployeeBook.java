public class EmployeeBook {
    private static Employee[] employees = new Employee[10];

    public static Employee[] getEmployees() {
        return employees;
    }

    //метод для наполнения массива сотрудников, с проверкой на дублирование информации
    public static boolean addToArray(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employee.equals(employees[i])) {
                System.out.println("сотрудник c такими данными уже есть в базе.");
                break;
            }
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        System.out.println("в базе нет места для - " + employee);
        return false;
    }

    //метод для вывода списка сотрудников кроме null(for each, toString)
    public static void listAllEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
    }

    //подсчет средней зарплаты
    public static double calculateAverageSalary(Employee[] employees) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            if (emp != null) {
                sum += emp.getSalary();
                count += 1;
            }
        }
        System.out.println("средняя зарплата списочного состава сотрудников " + sum / count + ".");
        return (double) sum / count;
    }

    //вывожу значение налогов по 2-м схемам (switch для выбора формулы расчета)
    public static void calculateTheTax(String tapeOfTax) {
        double tax;
        switch (tapeOfTax) {
            case "PROPORTIONAL":

                for (Employee emp : employees) {
                    if (emp != null) {
                        tax = emp.getSalary() * 0.13;
                        System.out.printf(emp.getFullName() + " сумма налога " + "%.2f.%n", tax);
                    }
                }
                break;
            case "PROGRESSIVE":
                for (Employee emp : employees) {
                    if (emp != null) {
                        if (emp.getSalary() > 0 && emp.getSalary() <= 150) {
                            tax = emp.getSalary() * 0.13;
                            System.out.printf(emp.getFullName() + " сумма налога " + "%.2f.%n", tax);

                        } else if (emp.getSalary() > 150 && emp.getSalary() <= 350) {
                            tax = emp.getSalary() * 0.17;
                            System.out.printf(emp.getFullName() + " сумма налога " + "%.2f.%n", tax);

                        } else if (emp.getSalary() > 350) {
                            tax = emp.getSalary() * 0.21;
                            System.out.printf(emp.getFullName() + " сумма налога " + "%.2f.%n", tax);
                        }
                    }
                }
                break;
        }
    }

    //создаю метод для индексации зарплат сотрудников по номеру отдела (применить continue)
    public static void indexTheSalary(int departmentNumber, int indexSalary) {
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() != departmentNumber) {
                    continue;
                }
                int newSalary;
                newSalary = emp.getSalary() + emp.getSalary() * indexSalary / 100;
                emp.setSalary(newSalary);
                System.out.println(emp.getFullName() + newSalary);
            }
        }
    }

    /*вывести первого сотрудника заданного отдела с зарплатой выше переданной
    вместе с номером id (для поиска for и  break, для вывода printShortInfo)
     */
    public static void printFirstEmployeeMaxSalary(int department, int salaryForComparison) {
        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            if (emp != null && emp.getDepartment() == department && emp.getSalary() > salaryForComparison) {
                System.out.print("№ " + emp.getId() + " ");
                emp.printShortInfo();
                break;
            }
        }
    }

    //выводим первые employeeNumber сотрудников с зарплатой меньше wage (используем while, break)
    public static void getEmployeesSalaryLowWage(int wage, int employeeNumber) {
        int count = 0;
        int i = 0;
        while (count <= employeeNumber && i < employees.length) {
            Employee emp = employees[i];
            if (emp == null) {
                break;
            }
            if (count == employeeNumber) {
                break;
            }
            if (emp != null && emp.getSalary() < wage) {
                count++;
                System.out.print(count);
                emp.printShortInfo();
            }
            i++;
        }
    }

    //проверяем наличие сотрудника в списке (сравнение через equals)
    public static boolean findEmployee(Employee employee) {
        for (Employee emp : employees) {
            if (emp == null) {
                break;
            }
            if (emp.equals(employee)) {
                System.out.println("сотрудник есть в базе.");
                return true;
            }
        }
        System.out.println("сотрудника нет в базе.");
        return false;
    }

    //метод получения сотрудника по id
    public static void getEmployeeThroughId(int id) {
        for (Employee emp : employees) {
            if (emp != null && emp.getId() == id) {
                System.out.println(emp);
            }
        }
    }
}