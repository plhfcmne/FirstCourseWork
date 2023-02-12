package FirstCourse;

public class EmployeeUtility {
    private static final int length = 10;
    public static final Employee[] BOOKOFEMPLOYEES = new Employee[length];

    public static void createBookOfEmployees() {
        for (int i = 0; i < EmployeeUtility.BOOKOFEMPLOYEES.length; i++) {
            BOOKOFEMPLOYEES[i] = new Employee("Иванов" + (i + 1), "Эльдар" + (i + 1), "Алексеевич" + (i + 1), (int) (Math.random() * 5 + 1), (float) (Math.random() * 130_000 + 50_000));
        }
    }

    public static float sumTotal() {
        float sum = 0;
        for (int i = 0; i < BOOKOFEMPLOYEES.length; i++) {
            sum = sum + BOOKOFEMPLOYEES[i].salary;
        }
        return sum;
    }

    public static Employee findMin() {
        int index = 0;
        float min = BOOKOFEMPLOYEES[index].salary;
        for (int i = 1; i < BOOKOFEMPLOYEES.length; i++) {
            if (min > BOOKOFEMPLOYEES[i].salary) {
                min = BOOKOFEMPLOYEES[i].salary;
                index = i;
            }
        }
        return BOOKOFEMPLOYEES[index];
    }

    public static Employee findMax() {
        int index = 0;
        float max = BOOKOFEMPLOYEES[index].salary;
        for (int i = 1; i < BOOKOFEMPLOYEES.length; i++) {
            if (max < BOOKOFEMPLOYEES[i].salary) {
                max = BOOKOFEMPLOYEES[i].salary;
                index = i;
            }
        }
        return BOOKOFEMPLOYEES[index];
    }

    public static float countAverage() {
        return sumTotal() / BOOKOFEMPLOYEES.length;
    }

    public static void printAll() {
        System.out.println("Вывод списка всех сотрудников:");
        for (int i = 0; i < BOOKOFEMPLOYEES.length; i++) {
            System.out.println(BOOKOFEMPLOYEES[i]);
        }
    }

    public static void printAllFIO() {
        for (int i = 0; i < BOOKOFEMPLOYEES.length; i++) {
            System.out.println(BOOKOFEMPLOYEES[i].getSurname() + " " + BOOKOFEMPLOYEES[i].getName() + " " + BOOKOFEMPLOYEES[i].getFatherName());
        }
    }
}
