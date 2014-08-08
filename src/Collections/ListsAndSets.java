package Collections;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by bobby on 30.07.2014.
 */
public class ListsAndSets {

    public static void main(String[] args) {

        Collection list = new ArrayList<String>(Arrays.asList(new String[]{"1", "40", "2", "1"}));
        Collection set = new HashSet<>(list);

        System.out.println(set);

    }

}
