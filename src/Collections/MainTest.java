package Collections;

import java.util.HashSet;

/**
 * Created by WhiteMountiens on 13.08.2014.
 */
public class MainTest {

    public static void main(String[] args) {

        HashSet pointHashSet = new HashSet();
        pointHashSet.add(new ClassPoint(1, 1));
        pointHashSet.add(new ClassPoint(2, 0));
        pointHashSet.add(new ClassPoint(2, 0));

        System.out.println(pointHashSet.toString());

    }

}