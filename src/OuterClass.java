public class OuterClass {

    InnerClass getInner() {
        InnerClass innerClass = new InnerClass();
        return innerClass;
    }

class InnerClass {
    void getMessage() {
        System.out.println("This message is from inner class");
    }
}

    public static void main(String[] args) {
        InnerClass innerClass = new OuterClass().getInner();
        innerClass.getMessage();
    }
}
