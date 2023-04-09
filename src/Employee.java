import java.util.Objects;

public class Employee {
    private final String name;
    private final String surname;
    private final String middleName;
    private int department;
    private int salary;

    static int count = 1;

    private int id;


    public Employee(String surname, String name, String middleName, int department, int salary) {

        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = (int) salary;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "_________" + "\n" + "Отдел: " + this.department + "\n" +
                "Фамилия: " + this.surname + "\n" + "Имя: " + this.name
                + "\n" + "Отчество: " + this.middleName + "\n" + "Заработная плата: "
                + this.salary + "\n" + "id: " + this.id + "\n" + "_________";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department
                && salary == employee.salary
                && id == employee.id
                && Objects.equals(name, employee.name)
                && Objects.equals(surname, employee.surname)
                && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, middleName, department, salary, id);
    }
}
