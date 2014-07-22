
public class VariablesVisibility {
    int k = 65;

    VariablesVisibility() {
        k = 1;
    }

    int inc(int k) {
        k++;
        return k;
    }

    void meth() {
        System.out.println(k);
    }

    public static void main(String[] args) {

        int k = 10;

        VariablesVisibility variablesVisibility = new VariablesVisibility();
        System.out.println(k);
        System.out.println(variablesVisibility.inc(100));
        System.out.println(k);
        variablesVisibility.meth();
    }
}
