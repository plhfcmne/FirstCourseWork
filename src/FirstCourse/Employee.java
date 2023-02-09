package FirstCourse;

public class Employee {
    String surname;
    String name;
    String fatherName;
    int department;
    public float salary;
    int id;
    static int counter = 1;

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

    public static void printAllFIO(Employee[] bookOfEmployees) {
        for (int i = 0; i < bookOfEmployees.length; i++) {
            System.out.println(bookOfEmployees[i].getSurname() + " " + bookOfEmployees[i].getName() + " " + bookOfEmployees[i].fatherName);
        }
    }

    @Override
    public String toString() {
        return "id " + id + ". Сотрудник: " + surname + " " + name + " " + fatherName + ". Отдел № " + department + " зарплата " + salary + " руб.";
    }
}
