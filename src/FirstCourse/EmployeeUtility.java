package FirstCourse;

public class EmployeeUtility {
    public static float sumTotal(Employee[] bookOfSalary) {
        float sum = 0;
        for (int i = 0; i < bookOfSalary.length; i++) {
            sum = sum + bookOfSalary[i].salary;
        }
        return sum;
    }

    public static int findMin(Employee[] bookOfSalary) {
        int index = 0;
        float min = bookOfSalary[index].salary;
        for (int i = 1; i < bookOfSalary.length; i++) {
            if (min > bookOfSalary[i].salary) {
                min = bookOfSalary[i].salary;
                index = i;
            }
        }
        return index;
    }

    public static int findMax(Employee[] bookOfSalary) {
        int index = 0;
        float max = bookOfSalary[index].salary;
        for (int i = 1; i < bookOfSalary.length; i++) {
            if (max < bookOfSalary[i].salary) {
                max = bookOfSalary[i].salary;
                index = i;
            }
        }
        return index;
    }

    public static float countAverage(Employee[] bookOfSalary) {
        return sumTotal(bookOfSalary) / bookOfSalary.length;
    }
}
