package FirstCourse;

public class Employee {
    String surname;
    String name;
    String fatherName;
    int department;
    float salary;
    int id;

    public Employee(String surname, String name, String fatherName, int department, float salary) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.department = department;
        this.salary = salary;
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

}
