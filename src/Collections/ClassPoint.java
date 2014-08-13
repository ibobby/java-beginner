package Collections;

/**
 * Created by WhiteMountiens on 13.08.2014.
 */
public class ClassPoint {

    private int x;
    private int y;

    public ClassPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        return x + y;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y;
    }
}
