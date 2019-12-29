package Lab3.Ex4;
public class MainPoint {
    public static void main(String[] args) {
        Point2d p2 = new Point2d(3,4);
        Point2d p22 = new Point2d(4,5);
        Point3D p3 = new Point3D(3,4,5);

        System.out.println(p2);
        p2.setXY(3,4);

        float[] arr = p2.getXY(0);
        for (int i=0;i<2;i++){
            System.out.println(arr[i]);
        }

        System.out.println(p3);
        p3.setXYZ(3,4,5);
        float[] arr3 = p3.getXYZ(0);
        for (int i=0;i<3;i++){
            System.out.println(arr3[i]);
        }

    }
}
