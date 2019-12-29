package Lab6.Ex1;

public class main {
    public static void main(String[] args) {
        MyPair<String, Integer> pi = new MyPair<>("Anders", 13);
        MyPair<String, Double> pd = new MyPair<>("Phoenix", 37.5);
//        MyPair<String, Integer> pdi = new MyPair<String, Double>("Blackfyre", 38.8);
        MyPair<String, Integer>[] grades = new MyPair[5];
        grades[0] = new MyPair<>("LYRIA", 1);
        grades[1] = new MyPair<>("RIVIA", 2);
        grades[2] = new MyPair<>("NIFFGARD", 3);
        for(MyPair<String, Integer> mp : grades)
            System.out.println(mp); // not assigned values are null
        MyPair<MyPair<String, Integer>, String> appointment = new MyPair<>(new MyPair<>("GERALT", 9), "OF RIVIA");
        System.out.println(appointment);
        // Can't swap components, since the types are unknown

    }
}
