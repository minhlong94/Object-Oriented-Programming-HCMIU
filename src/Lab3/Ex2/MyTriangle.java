package Lab3.Ex2;
public class MyTriangle {
    private MyPoint v1,v2,v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
    }

    public String printString(){
        return "MyTriangle:[v1=("+v1.getX() +"," + v1.getY()+"),v2=("+v2.getX() +","+ v2.getY()+"),v3=("+v3.getX()+","+v3.getY()+")]";
    }

    public void getPeri(){
        double dist = MyPoint.distance(v1,v2) + MyPoint.distance(v2,v3) + MyPoint.distance(v1,v3);
        System.out.println("Triangle perimeter is: " + dist);
    }

    public void getType(){
        if (MyPoint.distance(v1,v2) == MyPoint.distance(v2,v3) && MyPoint.distance(v1,v2) == MyPoint.distance(v1,v3))
            System.out.println("Equilateral");
        else if (MyPoint.distance(v1,v2) == MyPoint.distance(v2,v3) || MyPoint.distance(v1,v2) ==MyPoint.distance(v1,v3) || MyPoint.distance(v2,v3) == MyPoint.distance(v1,v3))
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}
