import FirstCourse.Employee;
import FirstCourse.EmployeeUtility;

public class Main {
    /*public static float sumTotal(Employee[] bookOfSalary){
        float sum=0;
        for (int i = 0; i <bookOfSalary.length ; i++) {
            sum=sum+bookOfSalary[i].salary;
        }
        return sum;
    }*/
    public static void main(String[] args) {

        Employee[] bookOfEmployees = new Employee[10];
        for (int i = 0; i < bookOfEmployees.length; i++) {
            bookOfEmployees[i] = new Employee("Иванов" + (i + 1), "Эльдар" + (i + 1), "Алексеевич" + (i + 1), (int) (Math.random() * 5 + 1), (float) (Math.random() * 130_000 + 50_000));
        }
        for (int i = 0; i < bookOfEmployees.length; i++) {
            System.out.println(bookOfEmployees[i]);
        }
        System.out.println("Общая сумма затрат на зарплату на месяц составила:"+ EmployeeUtility.sumTotal(bookOfEmployees)+" рублей");

        /*Employee employee1 = new Employee("Иванов1", "Эльдар1", "Алексеевич1", 5, 35278.5f);
        Employee employee2 = new Employee("Иванов2", "Эльдар2", "Алексеевич2", 1, 352782.5f);
        Employee employee3 = new Employee("Иванов3", "Эльдар3", "Алексеевич3", 2, 135278.5f);
        Employee employee4 = new Employee("Иванов4", "Эльдар4", "Алексеевич4", 4, 25278.5f);
        Employee employee5 = new Employee("Иванов5", "Эльдар5", "Алексеевич5", 2, 335278.5f);
        Employee employee6 = new Employee("Иванов6", "Эльдар6", "Алексеевич6", 3, 435278.5f);
        Employee employee7 = new Employee("Иванов7", "Эльдар7", "Алексеевич7", 5, 535278.5f);
        Employee employee8 = new Employee("Иванов8", "Эльдар8", "Алексеевич8", 3, 635278.5f);
        Employee employee9 = new Employee("Иванов9", "Эльдар9", "Алексеевич9", 2, 35278.5f);
        Employee employee10 = new Employee("Иванов10", "Эльдар10", "Алексеевич10", 4, 235278.5f);*/

    }
}