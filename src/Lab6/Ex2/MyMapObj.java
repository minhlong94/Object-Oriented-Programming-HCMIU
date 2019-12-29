package Lab6.Ex2;

public class MyMapObj {
    private String name;
    private int ID;

    public MyMapObj(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void put(int ID){
        this.setID(ID);
    }

}
