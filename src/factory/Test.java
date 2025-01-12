package factory;

public class Test {

    public static void main(String[] args) {
        Point point = new Point.Factory().newCartesian(1, 2);
    }
}
