package String.Level1;

public class NullPointerExceptionDemo {


    public static void generateException() {
        String text = null;

        System.out.println(text.length());
    }


    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully");
        }
    }

    public static void main(String[] args) {


        handleException();
    }
}