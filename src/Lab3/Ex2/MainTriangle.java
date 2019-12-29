package Lab3.Ex2;
public class MainTriangle {
    public static void main(String[] args) {
        MyTriangle tri = new MyTriangle(3,2,3,5,5,6);
        String getTri = tri.printString();
        System.out.println(getTri);
        tri.getPeri();
        tri.getType();
    }
}
