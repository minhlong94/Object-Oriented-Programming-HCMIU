package Lab6.Ex2;

public class mainWithoutGeneric {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long memUsed = r.totalMemory() - r.freeMemory();
        System.out.println("Used mem: " + memUsed);

        MyMapObj mobj = new MyMapObj("MEVE", 38);
        MyMapObj mobj2 = new MyMapObj("RAYNARD", 39);
        MyMapObj mobj3 = new MyMapObj("RAYNARD1", 40);
        MyMapObj mobj4 = new MyMapObj("RAYNARD2", 41);
        System.out.println(mobj.getID());
        System.out.println(mobj.getName());
        System.out.println(mobj2.getID());
        System.out.println(mobj2.getName());
        System.out.println(mobj3.getID());
        System.out.println(mobj3.getName());
        System.out.println(mobj4.getID());
        System.out.println(mobj4.getName());

        long memUsedAfter = r.totalMemory() - r.freeMemory();
        System.out.println("Mem increased:" + (memUsedAfter-memUsed));


    }

    // Comments:
    // Object used more memory when there were few objects, but less memory when there were more compares to HashMap
    // Hashmap used less memory when there are few maps, but more mem when there were more maps compares to Object
    // Object is easier to implement getter, setter(I think), and HashMap is harder to "getter" and "setter" (getKey and getValue)
    // Parameterized generic type is faster than generic raw type, but I do not know if it allows to implement many types?
}
