import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Main {


    public static void main(String[] args) {


        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Lebedev", "Igor", "Anatolievich", 1, 60_000);
        employeeBook.addEmployee("Pankov", "Mark", "Dmitrievich", 2, 555_000);
        employeeBook.addEmployee("Safonov", "Denis", "Vitalievich", 3, 70_000);
        employeeBook.addEmployee("Popov", "Daniil", "Valerievich", 5, 90_000);
        employeeBook.addEmployee("Kruglov", "Kirill", "Kirillovich", 1, 72_000);
        employeeBook.addEmployee("Ivanov", "Ivan", "Ivanovich", 2, 67_000);
        employeeBook.addEmployee("Belyaev", "Alexandr", "Sergeevich", 3, 240_000);
        employeeBook.addEmployee("Belimov", "Andrei", "Andreevich", 4, 80_000);
        employeeBook.addEmployee("Gres", "Roman", "Antonovich", 4, 333_000);
        employeeBook.addEmployee("Jukov", "Konstantin", "Petrovich", 5, 123_000);


        employeeBook.printEmployeesByDepartment();

        employeeBook.printAllEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц = " + employeeBook.totalSalaries());
        System.out.println("\n");
        System.out.println("Сотрудник с минимальной заработной платой" + "\n" +  employeeBook.findEmployeeWithMinSalary());
        System.out.println("\n");
        System.out.println("Сотрудник с максимальной заработной платой:" + "\n" + employeeBook.findEmployeeWithMaxSalary());
        System.out.println("\n");
        System.out.println("Среднее значение зарплаты = " + employeeBook.averageTotalSalaries());
        System.out.println("\n");
        System.out.println("_______________");
        System.out.println("Список сотрудников: ");
        employeeBook.printFullNameEmployees();
        System.out.println("_______________");

        employeeBook.indexSalaries(5);
        System.out.println("Зарплата после индексации");
        employeeBook.printAllEmployees();


        int department = 4;
        System.out.printf("Сотрудник с минимальной заработной платой %d отдела: %s%n", department,   employeeBook.findEmployeeWithMinSalaryForDepartment(department));
        System.out.printf("Сотрудник с максимальной заработной платой %d отдела: %s%n", department,  employeeBook.findEmployeeWithMaxSalaryForDepartment(department));
        System.out.println("\n");


        System.out.printf("Сумма затрат на зарплаты в месяц для %d отдела = %s%n", department, employeeBook.totalSalariesForDepartment(department));
        employeeBook.indexSalariesForDepartment(5,1);
        System.out.println("Средняя зарплата в месяц для отдела = " + 1);
        employeeBook.printAllEmployeesFortDepartment(1);
        employeeBook.printEmployeesWithSalaryLessThan(100_000);
        employeeBook.printEmployeesWithSalaryGreaterOrEqualThan(123_456);


    }



}