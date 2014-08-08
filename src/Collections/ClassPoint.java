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

    @Override
    public int hashCode() {
        return x + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) {
            return false;
        }

        if (obj.getClass()!= getClass()) {
            return false;
        }

        ClassPoint classPointObj = (ClassPoint) obj;

        if (x + y != classPointObj.x + classPointObj.y) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y;
    }
}
