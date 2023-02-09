package FirstCourse;

public class EmployeeUtility {
     public static float sumTotal(Employee[] bookOfSalary){
        float sum=0;
        for (int i = 0; i <bookOfSalary.length ; i++) {
            sum=sum+bookOfSalary[i].salary;
        }
        return sum;
    }
}
