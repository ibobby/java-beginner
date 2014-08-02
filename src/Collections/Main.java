package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by WhiteMountiens on 02.08.2014.
 */
public class Main {

    public static void main(String[] args) {

        //ArrayList vs LinkedList

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        System.out.println("ArrayList size = " + arrayList.size());
        long t0 = System.nanoTime();
        arrayList.remove(2);
        long t1 = System.nanoTime();
        long dif = t1 - t0;
        System.out.println("ArrayList del time :" + dif);

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);
        System.out.println(linkedList);
        t0 = System.nanoTime();
        linkedList.remove(1);
        t1 = System.nanoTime();
        dif = t1 - t0;
        System.out.println("LinkedList del time :" + dif);




    }

}
