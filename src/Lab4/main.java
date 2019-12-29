package Lab4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Comparator<Employee> byDate = new Employee.byDate();
        Employee e1 = new Employee("WTF1", "OwO",100, 0,3);
        Employee e2 = new Employee("WTF2", "UwU",50,1,0);
        Employee e3 = new Employee("WTF3", "uWu",70,0,0);
        ArrayList<Employee> e = new ArrayList<>();
        e.add(e1);
        e.add(e2);
        e.add(e3);
        Date d1 = new Date(100, 4, 5);
        Date d2 = new Date(101,4,5);
        Project p1 = new Project("NANI1", d1, d2, e);
        ProjectPrinter pp = new ProjectPrinter(p1);
        pp.run();
        System.out.println("Employee 1 to 2 is: " + byDate.compare(e1,e2));
        System.out.println("Employee 3 to 1 is: " + byDate.compare(e3,e1));
        System.out.println("Employee 2 to 3 is: " + byDate.compare(e2,e3));
        System.out.println("Budget: " + p1.estimateBudget());
        System.out.println(e1.toString());
        System.out.println(p1.toString());
    }
}
