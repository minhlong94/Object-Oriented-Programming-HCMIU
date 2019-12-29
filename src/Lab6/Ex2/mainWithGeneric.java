package Lab6.Ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mainWithGeneric {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mUsed = r.totalMemory() - r.freeMemory();
        System.out.println("Used mem: " + mUsed);

        Map<String, Integer> m = new HashMap<>();
        m.put("MEVE", 38);
        m.put("RAYNARD", 39);
        m.put("RAYNARD2", 40);
        m.put("RAYNARD3", 41);
        Set<Map.Entry<String, Integer>> set = m.entrySet();
        for (Map.Entry<String, Integer> eachm : set)
        {
            System.out.println(eachm.getKey());
            System.out.println(eachm.getValue());
        }
        long mUsedAfter = r.totalMemory() - r.freeMemory();
        System.out.println("Mem increased:" + (mUsedAfter - mUsed));
    }
}
