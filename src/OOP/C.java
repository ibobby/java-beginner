package OOP;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


/**
 * Created by WhiteMountiens on 09.10.2014.
 */
public class C implements Figure {

    Collection<Figure> figures = new ArrayList<>();

    void add(Figure f) {
        figures.add(f);
    }

    public C(C ... c) {
        this.figures = Arrays.asList(c);
    }

    @Override
    public void draw(Graphics g) {
        for (Figure f : figures) {
            f.draw(g);
        }
    }
}
interface Figure {
    void draw(Graphics g);
}


