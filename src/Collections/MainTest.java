package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by WhiteMountiens on 13.08.2014.
 */
public class MainTest {

    public static void main(String[] args) {


//        Sets

        HashSet<ClassPoint> pointHashSet = new HashSet();
        pointHashSet.add(new ClassPoint(1, 1));
        pointHashSet.add(new ClassPoint(2, 0));
        pointHashSet.add(new ClassPoint(2, 0));

        System.out.println(pointHashSet);

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Y");
        stringHashSet.add("Y");
        stringHashSet.add("Z");

        System.out.println(stringHashSet);

//        Maps

        Map stringHashMap = new HashMap<>();
        stringHashMap.put(1, "one");
        stringHashMap.put(1, "two");

        System.out.println(stringHashMap.hashCode());

        Map stringMap = new TreeMap<>();
        stringMap.put(1, "one");
        stringMap.put(1, "two");

        System.out.println(stringMap.hashCode());

    }

}
