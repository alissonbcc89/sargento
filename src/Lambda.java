public class Lambda {
    public static void main(String[] args) {

        Runnable r1 = () -> System.out.println("Hello lambda");

        r1.run();
    }
}
