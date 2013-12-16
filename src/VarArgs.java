
public class VarArgs {

    public void  varArgs(String msg, int...v) {
        System.out.println("Message " + msg);

        for (int i:v) {
            System.out.println(i);
        }
    }

}
