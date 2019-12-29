package Lab3.Ex3;
public class MainPSS {
    public static void main(String[] args) {
        Person khoi = new Student("KhoiNgu", "VietDuc", "EE", 2, 20);
        Person ch = new Staff("Coffee House","Hikari", "VietDuc",30);
        System.out.println(khoi.toString());
        khoi.setAddress("THANH PHO");
        System.out.println(khoi.getAddress());
        System.out.println(khoi.toString());
        System.out.println(ch.toString());
    }
}
