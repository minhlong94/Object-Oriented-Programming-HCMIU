package Lab3.Ex4;
import java.util.ArrayList;

public class Point2d {
    private float x, y = 0.0f;
    private ArrayList<Float> listX = new ArrayList<>();
    private ArrayList<Float> listY = new ArrayList<>();

    public Point2d(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        listX.add(x);
        listY.add(y);
    }
    public float[] getXY(int i){
        float[] arr = new float[2];
        arr[0] = listX.get(i);
        arr[1] = listY.get(i);
        return arr;
    }

    public String toString(){
        return "Point2D: " + "(" + x + ", " + y + ")";
    }
}
