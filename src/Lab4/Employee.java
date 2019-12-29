package Lab4;
import java.util.Comparator;

public class Employee{
    private String employeeID,employeeName;
    private int salaryPerHour,noOfLeavingDay, noOfTravelDay;

    public Employee(String employeeID, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }


    public double calWeeklySalary(){
        double WeeklySalary;
        WeeklySalary = salaryPerHour*8*(5-noOfLeavingDay + noOfTravelDay/2);
        return WeeklySalary;
    }

    public String toString(){
        return "Employee Name: " + employeeName + " Salary Per Hour: " + salaryPerHour + " Weekly Salary: "+ calWeeklySalary();
    }


    public static class byDate implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            if (e1.noOfTravelDay > e2.noOfTravelDay)
                return 1;
            else if (e1.noOfTravelDay < e2.noOfTravelDay)
                return -1;
            else
            {
                if (e1.noOfLeavingDay > e2.noOfLeavingDay)
                    return 1;
                else if (e1.noOfLeavingDay < e2.noOfLeavingDay)
                    return -1;
                else
                    return 0;
            }
        }
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public void setNoOfLeavingDay(int noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }

    public int getNoOfTravelDay() {
        return noOfTravelDay;
    }

    public void setNoOfTravelDay(int noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }

}
