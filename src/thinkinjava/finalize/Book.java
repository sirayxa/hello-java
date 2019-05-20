package thinkinjava.finalize;

public class Book {

    boolean checkedOut = false;

    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (checkedOut) {
            System.out.println("Error: checked out...");
        }
    }
}
