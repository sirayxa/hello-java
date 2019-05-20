package thinkinjava.staticfield;

public class StaticInitialization {

    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupborad();
        System.out.println("Creating new Cupboard() in main");
        new Cupborad();
        table.f2(1);
        cupborad.f3(3);
    }

    static Table table = new Table();
    static Cupborad cupborad = new Cupborad();
}
