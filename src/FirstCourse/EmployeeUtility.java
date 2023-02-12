package FirstCourse;

public class EmployeeUtility {
    private static final int length = 10;
    public static final Employee[] BOOKOFEMPLOYEES = new Employee[length];

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

    public static void printAllFIO() {
        for (int i = 0; i < BOOKOFEMPLOYEES.length; i++) {
            System.out.println(BOOKOFEMPLOYEES[i].getSurname() + " " + BOOKOFEMPLOYEES[i].getName() + " " + BOOKOFEMPLOYEES[i].getFatherName());
        }
    }
}
