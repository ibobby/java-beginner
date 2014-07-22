package Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyMarker
@What(declaration = "class declaration")
@MyAnno(str = "Annotation exmple for class", val = 1000)
public class Meta {

    @What(declaration = "method declaration")
    @MyAnno( val = 100)
    public void myMeth(String hi) {

        Meta ob = new Meta();
        Class c = ob.getClass();
        if (c.isAnnotationPresent(MyMarker.class)) {
            System.out.println("MyMarker present");
        }

        Annotation annot[] = c.getAnnotations();
        for (Annotation a : annot) {
            System.out.println(a);
        }

        try {
            Method m = c.getMethod("myMeth", String.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            annot = m.getAnnotations();
            for (Annotation a: annot) {
                System.out.println(a);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

    }

}
