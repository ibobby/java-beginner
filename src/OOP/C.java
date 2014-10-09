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

    public C(Figure ... figures) {
        this.figures = Arrays.asList(figures);
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

class O implements Figure {

    @Override
    public void draw(Graphics g) {

    }
}

class App {
    public static void main(String[] args) {
        new C(new C(new C(new O())), new C());
    }
}


