import FirstCourse.Employee;
import FirstCourse.EmployeeUtility;

public class Main {
    public static void separator() {
        System.out.println("================================================================================");
    }
    public static void main(String[] args) {
        for (int i = 0; i < EmployeeUtility.BOOKOFEMPLOYEES.length; i++) {
            EmployeeUtility.BOOKOFEMPLOYEES[i] = new Employee("Иванов" + (i + 1), "Эльдар" + (i + 1), "Алексеевич" + (i + 1), (int) (Math.random() * 5 + 1), (float) (Math.random() * 130_000 + 50_000));
        }
        System.out.println("Вывод списка всех сотрудников:");
        for (int i = 0; i < EmployeeUtility.BOOKOFEMPLOYEES.length; i++) {
            System.out.println(EmployeeUtility.BOOKOFEMPLOYEES[i]);
        }
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