package FirstCourse;

public class Employee {
    private String surname;
    private final String name;
    private final String fatherName;
    private int department;
    public float salary;
    private final int id;
    private static int counter = 1;

    public Employee(String surname, String name, String fatherName, int department, float salary) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id " + id + ". Сотрудник: " + surname + " " + name + " " + fatherName + ". Отдел № " + department + " зарплата " + salary + " руб.";
    }
}
