import FirstCourse.Employee;
import FirstCourse.EmployeeUtility;

public class Main {
    public static void separator() {
        System.out.println("================================================================================");
    }
    public static void main(String[] args) {

        Employee[] bookOfEmployees = new Employee[10];
        for (int i = 0; i < bookOfEmployees.length; i++) {
            bookOfEmployees[i] = new Employee("Иванов" + (i + 1), "Эльдар" + (i + 1), "Алексеевич" + (i + 1), (int) (Math.random() * 5 + 1), (float) (Math.random() * 130_000 + 50_000));
        }
        System.out.println("Вывод списка всех сотрудников:");
        for (int i = 0; i < bookOfEmployees.length; i++) {
            System.out.println(bookOfEmployees[i]);
        }
        separator();
        System.out.println("Общая сумма затрат на зарплату в месяц составила:" + EmployeeUtility.sumTotal(bookOfEmployees) + " рублей");
        System.out.println();
        System.out.println("Самый грустный сотрудник в день зарплаты: " + bookOfEmployees[EmployeeUtility.findMin(bookOfEmployees)]);
        System.out.println();
        System.out.println("Самый счастливый сотрудник в день зарплаты: " + bookOfEmployees[EmployeeUtility.findMax(bookOfEmployees)]);
        System.out.println();
        System.out.println("Средняя зарплата в компании " + EmployeeUtility.countAverage(bookOfEmployees));
        separator();
        System.out.println("Вывод сотрудников по-фамильно:");
        Employee.printAllFIO(bookOfEmployees);


    }
}