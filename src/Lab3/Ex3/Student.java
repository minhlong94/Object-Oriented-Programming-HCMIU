package Lab3.Ex3;
public class Student extends Person {
    private String program;
    private double fee;
    private int year;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;

    }
    public String getProgram(){
        return program;
    }

    public double getFee() {
        return fee;
    }

    public int getYear() {
        return year;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String toString() {
        return "Student" +" Name:" + super.getName() + " Address:" + super.getAddress() + " Program:"+ program + " Year:" + year + " Fee:" +  fee;
    }
}
