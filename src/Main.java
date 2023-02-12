import FirstCourse.Employee;
import FirstCourse.EmployeeUtility;

public class Main {
    public static void separator() {
        System.out.println("================================================================================");
    }

    public static void main(String[] args) {
        EmployeeUtility.createBookOfEmployees();
        EmployeeUtility.printAll();
        separator();
        System.out.println("Общая сумма затрат на зарплату в месяц составила:" + EmployeeUtility.sumTotal() + " рублей");
        System.out.println();
        System.out.println("Самый грустный сотрудник в день зарплаты: " + EmployeeUtility.findMin());
        System.out.println();
        System.out.println("Самый счастливый сотрудник в день зарплаты: " + EmployeeUtility.findMax());
        System.out.println();
        System.out.println("Средняя зарплата в компании " + EmployeeUtility.countAverage());
        separator();
        System.out.println("Вывод сотрудников по-фамильно:");
        EmployeeUtility.printAllFIO();

    }
}