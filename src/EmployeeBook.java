public class EmployeeBook {
    private static Employee[] employees = new Employee[10];

    public static Employee[] getEmployees() {
        return employees;
    }

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
        return false;
    }


    public static void listAllEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
                continue;
            }
        }
    }

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
        System.out.println("средняя зарплата " + sum / count + ".");
        return (double) sum / count;
    }

    public static void calculateTheTax(Employee[] employees) {
        String tapeOfTax = "PROGRESSIVE";
        double tax;
        switch (tapeOfTax) {
            case "PROPORTIONAL":

                for (Employee emp : employees) {
                    if (emp != null) {
                        tax = emp.getSalary() * 0.13;
                        System.out.printf(emp.getFullName() + "%.2f.%n",tax);
                    }
                }
                break;
            case "PROGRESSIVE":
                for (Employee emp : employees) {
                    if (emp != null) {
                        if (emp.getSalary() > 0 && emp.getSalary() <= 150) {
                            tax = emp.getSalary() * 0.13;
                            System.out.printf(emp.getFullName() + "%.2f.%n",tax);

                        } else if (emp.getSalary() > 150 && emp.getSalary() <= 350) {
                            tax = emp.getSalary() * 0.17;
                            System.out.printf(emp.getFullName() + "%.2f.%n",tax);

                        } else if (emp.getSalary() > 350) {
                            tax = emp.getSalary() * 0.21;
                            System.out.printf(emp.getFullName() + "%.2f.%n",tax);
                        }
                    }
                }
                break;
        }
    }
}