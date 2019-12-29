package Lab4;
public class ProjectPrinter implements Runnable {
    private Project proj;
    private Thread t;

    public ProjectPrinter(Project proj) {
        this.proj = proj;
    }

    @Override
    public void run() {
        System.out.println("Project ID: " + proj.getProjectID());
        System.out.println("Project Duration: " + proj.getStartDate() + " to " + proj.getEndDate());
        try {
            for (Employee e: proj.getListOfEmployee()){
                System.out.println("Name: " + e.getEmployeeName() + " Salary Per Hour: " + e.getSalaryPerHour());
            }
            Thread.sleep(100);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
            System.out.println("Thread is interrupted");
        }
    }
    }

