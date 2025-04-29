package devdojo.exception.error.test;

public class StackOverflowErrorTest {

    public static void recursive(){
        recursive();
    }

    public static void main(String[] args) {
        recursive();
    }
}
