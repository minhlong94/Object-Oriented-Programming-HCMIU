package Lab4;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Project {
    private String projectID;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> listOfEmployee;
    private int budget = 0;
    private String listE = "";

    public Project(String projectID, Date startDate, Date endDate, ArrayList<Employee> listOfEmployee) {
        this.projectID = projectID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfEmployee = listOfEmployee;
    }


    public long estimateBudget(){
        for (Employee e : listOfEmployee){
            budget = budget + e.getSalaryPerHour()*24*7;
        }
        long milliSecondsElapsed = endDate.getTime() - startDate.getTime();
        long diff = TimeUnit.MINUTES.convert(milliSecondsElapsed, TimeUnit.MILLISECONDS);
        diff = diff/(1440*7);
        return budget*diff;
    }
    public String toString(){
        for (Employee e: listOfEmployee){
            listE = listE + "\n" + e;
        }
        return listE;
    }

    // Getter Setter thingy goes here

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }
}
