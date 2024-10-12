public class Singleton {
    private static Singleton single_instance = null;

    private Singleton() {
        //nothing to see
    }
    public static Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println("Hashcode a: "+a.hashCode());
        System.out.println("Hashcode b: "+b.hashCode());
        if (a == b) {
            System.out.println("Same instance, singleton");
        } else {
            System.out.println("Different, not a singleton");
        }

    }
}
