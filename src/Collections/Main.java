package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by WhiteMountiens on 02.08.2014.
 */
public class Main {

    public static void main(String[] args) {

        //ArrayList vs LinkedList
        //AL - good reading
        //LL must be more stable on add operation

        int arraySize = 100000;

        ArrayList<String> arrayList = new ArrayList<String>();


        System.out.println("size = " + arrayList.size());

        //add

        long t0 = System.nanoTime();
        for (int i = 0; i < arraySize; i++) {
            arrayList.add("" + i);
        }
        long t1 = System.nanoTime();
        long dif = t1 - t0;
        System.out.println("ArrayList  add time :" + dif);

        LinkedList linkedList = new LinkedList();
        t0 = System.nanoTime();
        for (int i = 0; i < arraySize; i++) {
            linkedList.add("" + i);
        }
        t1 = System.nanoTime();
        dif = t1 - t0;
        System.out.println("LinkedList add time :" + dif);

        //del

        t0 = System.nanoTime();
        for (int i = 0; i < arraySize; i++) {
            arrayList.get(i);
        }
        t1 = System.nanoTime();
        dif = t1 - t0;
        System.out.println("ArrayList  get time :" + dif);

        t0 = System.nanoTime();
        for (int i = 0; i < arraySize; i++) {
            linkedList.get(i);
        }
        t1 = System.nanoTime();
        dif = t1 - t0;
        System.out.println("LinkedList get time :" + dif);


    }

}
