package Lab3.Ex2;

public class MyPoint{
    private int x,y;

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static double distance(MyPoint thisPt, MyPoint otherPt){
        double dx = thisPt.getX() - otherPt.getX();
        double dy = thisPt.getY() - otherPt.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
