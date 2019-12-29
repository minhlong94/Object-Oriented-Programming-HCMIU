package Lab3.Ex4;
import java.util.ArrayList;

public class Point3D extends Point2d {
    private float z = 0.0f;
    private ArrayList<Float> listX = new ArrayList<>();
    private ArrayList<Float> listY = new ArrayList<>();
    private ArrayList<Float> listZ = new ArrayList<>();

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        listX.add(x);
        listY.add(y);
        listZ.add(z);
    }

    public float[] getXYZ(int i){
        float[] arr = new float[3];
        arr[0] = listX.get(i);
        arr[1] = listY.get(i);
        arr[2] = listZ.get(i);
        return arr;
    }

    public String toString(){
        return "Point3D: " + "(" + super.getX() + ", " + super.getY() + ", "+ z + ")";
    }
}
