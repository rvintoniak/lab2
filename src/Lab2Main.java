import java.util.Set;
import java.util.TreeSet;

public class Lab2Main {


    public static void main(String[] args) {
        Set<AbstractEmployee> employees = new TreeSet<AbstractEmployee>();
        employees.add(new EmployeeFixed(1,"Mike",3000));
        employees.add(new EmployeePerHour(5,"Adam",90));
        employees.add(new EmployeeFixed(4,"John",1500));
        employees.add(new EmployeePerHour(6,"Andrew",90));
        employees.add(new EmployeeFixed(7,"James",4500));
        employees.add(new EmployeePerHour(9,"Kate",18));
        employees.add(new EmployeeFixed(12,"Alex",4500));
        employees.add(new EmployeePerHour(11,"Mike",10));
        employees.add(new EmployeeFixed(3,"Paul",4500));

        System.out.println("----------------First five names-------------------");

        for(int i=0; i<5; i++) {
            System.out.println(((AbstractEmployee)employees.toArray()[i]).name);
        }

        System.out.println("------------------Last three id--------------------");


        for(int i=employees.toArray().length-3;i<employees.toArray().length; i++) {
            System.out.println(((AbstractEmployee)employees.toArray()[i]).id);
        }

    }

}
